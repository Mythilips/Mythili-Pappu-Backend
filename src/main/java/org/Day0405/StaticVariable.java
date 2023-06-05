package org.Day0405;

public class StaticVariable {

        private static int staticVariable;

        static {
            staticVariable = initializeStaticVariable();
        }

        public static int initializeStaticVariable() {
            // Perform some logic to initialize the static variable
            return 42;
        }

        public static int getStaticVariable() {
            return staticVariable;
        }
    }
