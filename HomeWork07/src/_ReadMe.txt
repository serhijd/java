Домашнее задание:
1. Написать класс Student с полями
    String name,
    int age,
    String group и
    реализовать для него equals() и hashCode().

    Научиться писать его в электронном блокноте безошибочно.

2. Создать immutable object
    (обязательно должна присутствовать ссылка на mutable часть).
    Научиться писать его в электронном блокноте безошибочно.

    Note:
    It appears as the presentation was build around this article
    https://dzone.com/articles/how-to-create-an-immutable-class-in-java
    with simplification of the Age class to contain only a year instead of all date attributes.

    Override equals() and hashCode()
    https://javarush.ru/groups/posts/1340-peregruzka-metodov-equals-i-hashcode-v-java

    @Override
    public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    result = prime * result + id;
    result = prime * result + ((lastName == null) ? 0 : lastName.hashCode()); return result;
    }
    http://www.seostella.com/ru/article/2012/10/04/kak-sgenerirovat-hashcode-v-java.html
    public class TestClass {
        private boolean booleanValue = true;
        private char charValue = 'd';
        private String stringValue = "TestClass";
        private long longValue = 34829245849498300l;
        private float floatValue = 345832400.93f;
        private double doubleValue = 98584292348454.9834;
        private byte[] arrayValue = {1, 2, 3};

        @Override
        public int hashCode() {
            int result = 17;

            result = 37 * result + ( booleanValue ? 1 : 0 );
            result = 37 * result + (int) charValue;
            result = 37 * result + (stringValue == null ? 0 : stringValue.hashCode());
            result = 37 * result + (int)(longValue - (longValue >>> 32));
            result = 37 * result + Float.floatToIntBits(floatValue);
            long longBits = Double.doubleToLongBits(doubleValue);
            result = 37 * result + (int)(longBits - (longBits >>> 32));
            for( byte b : arrayValue )
                result = 37 * result + (int) b;

            return result;
        }

    }