# SPDX-FileCopyrightText: 2022 Dan Halbert for Adafruit Industries
#
# SPDX-License-Identifier: Unlicense

from secrets import secrets  # pylint: disable=no-name-in-module

import socketpool
import wifi

from adafruit_httpserver import HTTPServer, HTTPResponse

ssid = secrets["ssid"]
print("Connecting to", ssid)
wifi.radio.connect(ssid, secrets["password"])
print("Connected to", ssid)
print(f"Listening on http://{wifi.radio.ipv4_address}:80")

pool = socketpool.SocketPool(wifi.radio)
server = HTTPServer(pool)


@server.route("/")
def base(request):  # pylint: disable=unused-argument
    """Default reponse is /index.html"""
    return HTTPResponse(filename="/index.html")


# startup the server
server.start(str(wifi.radio.ipv4_address))

while True:
    try:
        # do something useful in this section,
        # for example read a sensor and capture an average,
        # or a running total of the last 10 samples

        # process any waiting requests
        server.poll()
    except OSError:
        continue
