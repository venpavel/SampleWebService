package example;

// таже аннотация, что и при описании интерфейса,
import javax.jws.WebService;

// но здесь используется с параметром endpointInterface,
// указывающим полное имя класса интерфейса нашего веб-сервиса
@WebService(endpointInterface = "example.SampleWebService")

public class SampleWebServiceImpl implements SampleWebService{
    @Override
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        System.err.println("Error world");
        return result;
    }

    @Override
    public String Calculator(int first, int second, String operation){
        String result = "";
        switch (operation){
            case "+": result = "" + (first + second);
                break;
            case "-": result = "" + (first - second);
                break;
            case "*": result = "" + first * second;
                break;
            case "/": result = "" + first / second;
                break;
            case "now": result = "Ну сейчас я не могу - Калугина еще здесь...";
                break;
            default:  result = "Invalid inputs";
                break;
        }


        return result;
    }

}