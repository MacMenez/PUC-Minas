func fatorial(num: Int) -> Int{

    if (num == 0 || num == 1){
        return 1
    }
    
    return (num * fatorial(num: num - 1))
}



print(fatorial(num: 4))