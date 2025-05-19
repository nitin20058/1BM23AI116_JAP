public class boxing {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(10);
        // Double boxing
        Double boxedDouble = Double.valueOf(20.5);
        // Character boxing
        Character boxedChar = Character.valueOf('A');
        // Boolean boxing
        Boolean boxedBoolean = Boolean.valueOf(true);
        // Float boxing
        Float boxedFloat = Float.valueOf(30.5f);
        // Unboxing: Converting wrapper class objects back to their primitive data types
        // Integer unboxing
        int unboxedInt = boxedInt.intValue();
        // Double unboxing
        double unboxedDouble = boxedDouble.doubleValue();

        // Character unboxing
        char unboxedChar = boxedChar.charValue();
        // Boolean unboxing
        boolean unboxedBoolean = boxedBoolean.booleanValue();
        // Float unboxing
        float unboxedFloat = boxedFloat.floatValue();
        // Display results
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Boxed Boolean: " + boxedBoolean);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Unboxed Float: " + unboxedFloat);
    }
}
