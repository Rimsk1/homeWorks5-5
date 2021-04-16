package hw13.cars.message;


import java.util.ArrayList;
import java.util.List;

public class MessageTsk {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
        int l=0, m=0, h=0, u=0;
        for (Message message:messageList) {
            if(message.getPriority().equals(Message.MessagePriority.LOW)){
            l+=1;
        }
            if(message.getPriority().equals(Message.MessagePriority.MEDIUM)){
                m+=1;
            }
            if(message.getPriority().equals(Message.MessagePriority.HIGH)){
                h+=1;
            }
            if(message.getPriority().equals(Message.MessagePriority.URGENT)){
                u+=1;
            }
        }
        System.out.println("LOW" + l);
        System.out.println("MEDIUM" + m);
        System.out.println("HIGHT" + h);
        System.out.println("URGENT" + u);


    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль

        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 90, i = 0, j = 0;
        for (Message message:messageList
             ) {
            if(message.getCode()==0){
                a+=1;
            }
            if(message.getCode()==1){
                b+=1;
            }
            if(message.getCode()==2){
                c+=1;
            }
            if(message.getCode()==3){
                d+=1;
            }
            if(message.getCode()==4){
                e+=1;
            }
            if(message.getCode()==5){
                f+=1;
            }
            if(message.getCode()==6){
                g+=1;
            }
            if(message.getCode()==7){
                h+=1;
            }
            if(message.getCode()==8){
                i+=1;
            }
            if(message.getCode()==9){
                j+=1;
            }
        }
        System.out.println("0" + a);
        System.out.println("9" + j);
    }
    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return null;
    }

    public static List<Message> copyEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на каждое сообщение с заданным приоритетом
        //  метод должен вернуть новую коллекцию
        return null;
    }

    public static List<Message> copyOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на все сообщения, кроме тех, которые имеют заданный приоритет
        //  метод должен вернуть новую коллекцию
        return null;
    }

    public static void main(String[] args) {
        List<Message> messages = Message.MessageGenerator.generate(34);
        System.out.println(messages);
        // вызов методов
    }
}