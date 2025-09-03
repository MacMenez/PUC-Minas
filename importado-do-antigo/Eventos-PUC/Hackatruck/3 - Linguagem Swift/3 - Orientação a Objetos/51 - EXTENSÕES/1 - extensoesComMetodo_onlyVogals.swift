extension String {
    func onlyVogals() -> String {
        var vogals = ""
        
        for c in self {
            let letter = "\(c)"
            if (letter == "a" || letter == "e" || letter == "i" || 
                letter == "o" || letter == "u") {
                vogals += letter
            }
        }
        
        return vogals
    }
}


let hello = "Hello, World!"
print(hello.onlyVogals())
// Será impresso: "eoo"
