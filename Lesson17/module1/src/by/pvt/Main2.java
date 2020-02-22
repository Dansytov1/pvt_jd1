package by.pvt;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;

/**
 *
 */

public class Main2 {

    public static void main(String[] args) {
        List<Candidate>candidates= List.of(
                new Candidate("Ivanov", "Backe End Developer", true),
                new Candidate("Petrov", "Backe End Developer", false),
                new Candidate("Sidorov", "Front End Developer", true),
                new Candidate("Fedorova", "QA", true)

        );
        interview(candidates).forEach(System.out::println);
    }

    public static List<Employee>interview(
        List<Candidate>candidates
    ){
        return candidates.stream()
                .filter(Objects::nonNull)
                .filter(Candidate::isPassedExam)
                .map(candidate -> {
                    Employee newEmployee = new Employee();
                    newEmployee.setName(candidate.getName());
                    newEmployee.setTitle("Junior "+candidate.getSkill());
                    newEmployee.setSalary(new Random().nextLong());
                    return newEmployee;
                })
                .collect(Collectors.toList());
    }
}
