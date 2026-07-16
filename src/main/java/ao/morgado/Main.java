package ao.morgado;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World, I´m doing a review of Java fundamentals!");

        // Converting foreach with if

        List<String> names = List.of("Jac@k", "Paula", "Kate", "Peter");
        // System.out.println(names.size());

        // imperative way
//        for(String name : names) {
//            System.out.println(name);
//        }

        // functional way
        //names.forEach(System.out::println);

        System.out.println("foreach with a if");
        // imperative way:
//        for(String name : names) {
//            if(name.length() == 4) { // length: Returns the length of this string
//                System.out.println(name);
//            }
//        }

        // functional way
        names.stream()
                .filter(name -> name.contains("@"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("=================\n\n");

//        List<CitizenDto.Citizens> createCitizens = List.of(
//                new CitizenDto.Citizens("1234LA046", "1234LA046", "******"),
//                new CitizenDto.Citizens("1234LA046", "1234LA046", "******")
//        );

        List<Citizen> citizens = List.of(
                new Citizen("1234LA046", "1234LA046", "******", "Luanda"),
                new Citizen("1234LA046", "1234LA046", "******", "Huambo"),
                new Citizen("1234LA046", "1234LA046", "******", "Luanda")
        );

        citizens.stream()
                .filter(citizen -> "Luanda".equals(citizen.getProvince()))
                .map(citizen -> new Citizen(
                        citizen.getNif(),
                        citizen.getUsername(),
                        citizen.getPassword(),
                        citizen.getProvince().toUpperCase()
                ))
                .forEach(System.out::println);

//        citizens.stream()
//                .map()
//                .forEach(System.out::println);
    }
}