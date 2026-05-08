import java.util.List;

import utils.Employed;
public class App {
    public static void main(String[] args) throws Exception {
        List<Employed> employedList = List.
        of(new Employed("Juanito", 24, 3300.00),
           new Employed("Maria", 28, 5300.00),
            new Employed("Carlos", 38, 6300.00),
            new Employed("Saida", 45, 7300.00),
            new Employed("Ariel", 49, 10300.00));
        
        employedList.stream().
        filter(employed -> employed.getAge() > 30).
          sorted((firstEmployed, secondEmployed) -> (-firstEmployed.getSalary().intValue() + secondEmployed.getSalary().intValue())).
        forEach(employed -> employed.info());
        
    }
}
