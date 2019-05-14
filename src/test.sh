java OctalToDecimalConverter.java --base 8 10 >actual
diff ExpectedOutputForInput10 actual
java OctalToDecimalConverter.java --base 8 2 >actual
diff ExpectedOutputForInput2 actual
java OctalToDecimalConverter.java --base 8 3 >actual
diff ExpectedOutputForInput3 actual
java OctalToDecimalConverter.java --base 8 8 >actual
diff ExpectedOutputForInput8 actual