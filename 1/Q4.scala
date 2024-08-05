def initialPrice(copiesCount : Double) : Double = {
    return copiesCount * 24.95
}

def discountedPrice(price : Double) : Double = {
    return price - price*(40/100f)
}

def shippingCost(copiesCount : Double) : Double = {
    return (if (copiesCount<50) copiesCount*3 else (copiesCount-50)*0.75 + 150)
}

def finalCost(copiesCount : Double) : Double = {
    return (discountedPrice(initialPrice(copiesCount)) + shippingCost(copiesCount)) 
}