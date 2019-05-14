java BaseConverter.java --base 8 10 >actual
diff ExpectedOutputForInput10Base8 actual
java BaseConverter.java --base 8 2 >actual
diff ExpectedOutputForInput2Base8 actual
java BaseConverter.java --base 8 3 >actual
diff ExpectedOutputForInput3Base8 actual
java BaseConverter.java --base 8 8 >actual
diff ExpectedOutputForInput8Base8 actual