package classroom._23_11_2019;
import static classroom._23_11_2019.Common.*;

import java.util.List;
import java.util.stream.Collectors;

public class SubjectObjectVerb {


    public static void main(String[] args) {
        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs =    list("wrote", "chased", "slept on");
        List<String> objects =  list("the book","the ball","the bed");
        printSentences(createSentences(subjects,verbs,objects));

        List<String> sentences =
                subjects.stream().flatMap(subj ->
                        verbs.stream().flatMap(verb ->
                                objects.stream().map(obj ->
                                        String.format("%s %s %s", subj,verb,obj)
                        ))).collect(Collectors.toList());

        printSentences(sentences);
    }

}
