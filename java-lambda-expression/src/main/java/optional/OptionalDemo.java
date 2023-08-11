package optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        //these three Static method using to do Optional
        //of, empty, ofNullable
        String email = "chandrakant@gmail.com";

//        Optional<Object> emptyOptional = Optional.empty();//empty method
//        System.out.println(emptyOptional);
//
//        Optional<String> emailOptional = Optional.of(email);//of method
//        System.out.println(emailOptional);
//
//        Optional<String> stringOptional = Optional.ofNullable(email);//ofNullable method
//        System.out.println(stringOptional);
//
//        Optional<String> stringOptional1 = Optional.ofNullable(email);//get method
//        System.out.println(stringOptional1.get());
//
//        if (stringOptional1.isPresent()) {            //isPresent method
//            System.out.println(stringOptional1.get());
//        } else {
//            System.out.println("no value is present. ");
//        }
        Optional<String> stringOptional2 = Optional.ofNullable(email); //orElse method
        String defaultOptional1 = stringOptional2.orElse("default@gamil.com");
        System.out.println(defaultOptional1);

        String defaultOptional2 = stringOptional2.orElseGet(() -> "default@gmail.com"); //orElseGet
        System.out.println(defaultOptional2);

        String optionalObject = stringOptional2.orElseThrow(() -> new IllegalArgumentException("Email Doesn't Exists!"));
        System.out.println(optionalObject);  //orElseThrow

        //if present
        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOptional1 = Optional.empty();
        gender.ifPresent((s) -> System.out.println("Value is Present!"));//ifPresent method
        emptyOptional1.ifPresent((s) -> System.out.println("no Value is Present!"));

        String result = "abc";
        if (result != null && result.contains("abc")) {
            System.out.println(result);
        }
        Optional<String> optionalStr = Optional.of(result); //filter method
        optionalStr.filter(res -> res.contains("abc"))
                .ifPresent((res) -> System.out.println(res));

        //map method in Optional provides a way to transfer value in optional from one type to another
        String result1 = "  xyz  ";
        if (result1 != null && result1.contains("xyz")) {
            System.out.println(result1);
        }
        Optional<String> optionalStr1 = Optional.of(result1);
        optionalStr1.filter(res -> res.contains("xyz")) //map method
                .map(String::trim)
                .ifPresent((res) -> System.out.println(res));
    }
}
