package com.example.calculator

sealed class CalculatorAction{
    data class Number(val number:Int) : CalculatorAction()
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
    object DecimalPlace: CalculatorAction()
    data class Operation(val operator: CalculatorOperation):CalculatorAction()
    object Calculate : CalculatorAction()

}