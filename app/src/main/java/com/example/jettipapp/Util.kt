package com.example.jettipapp

fun calculateTotalTip(totalBill: Double,
                      tipPercent: Int):Double{
    return if (totalBill>1) totalBill*tipPercent/100 else 0.0
}

fun calculateTotalPerPerson(totalBill: Double,
                            splitBy: Int,
                            tipPercent: Int): Double{
    return (totalBill+ calculateTotalTip(totalBill,tipPercent))/splitBy
}
