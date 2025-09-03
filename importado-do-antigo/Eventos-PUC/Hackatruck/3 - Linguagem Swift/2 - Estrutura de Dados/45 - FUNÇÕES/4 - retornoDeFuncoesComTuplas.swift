func buscarLatitudeLongitude() -> (String, Double, Double) {
    return ("Campinas", -22.002, -25.012)
}

let (cidade, lat, lng) = buscarLatitudeLongitude()
// Agora, temos: cidade = "Campinas, lat = -22.002 e lng = -25.012


print(cidade)
print(lat)
print(lng)
