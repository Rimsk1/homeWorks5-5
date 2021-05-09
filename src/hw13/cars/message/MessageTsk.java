package hw13.cars.message;


import java.util.*;
import java.util.stream.Collectors;

public class MessageTsk {
    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритела
        //  Ответ в консоль
//        int l = 0, m = 0, h = 0, u = 0;
//        for (Message message : messageList) {
//            if (message.getPriority().equals(Message.MessagePriority.LOW)) {
//                l += 1;
//            }
//            if (message.getPriority().equals(Message.MessagePriority.MEDIUM)) {
//                m += 1;
//            }
//            if (message.getPriority().equals(Message.MessagePriority.HIGH)) {
//                h += 1;
//            }
//            if (message.getPriority().equals(Message.MessagePriority.URGENT)) {
//                u += 1;
//            }
//        }
//        System.out.println("LOW" + l);
//        System.out.println("MEDIUM" + m);
//        System.out.println("HIGHT" + h);
//        System.out.println("URGENT" + u);
        int[] counts = new int[Message.MessagePriority.values().length];
        for (Message message: messageList){
            counts[message.getPriority().ordinal()]++;
        }


    }

    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль

        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (Message message: messageList) {

          int code1 = message.getCode();
          countMap.put(code1, countMap.getOrDefault(code1, 0) + 1);// в одну строчку, работает getordefault
//            if (Message message: messageList){
//        for (Message message: messageList) {
//            if(countMap.containsKey(message.getCode()){
//                countMap.put(message.getCode(), message.getCode()+1);
//
//            } else {
//                countMap.put(message.getCode(), 1);
//            }


        }



//
//        for (Message message : messageList
//        ) {
//            if (message.getCode() == 0) {
//                a += 1;
//            }
//            if (message.getCode() == 1) {
//                b += 1;
//            }
//            if (message.getCode() == 2) {
//                c += 1;
//            }
//            if (message.getCode() == 3) {
//                d += 1;
//            }
//            if (message.getCode() == 4) {
//                e += 1;
//            }
//            if (message.getCode() == 5) {
//                f += 1;
//            }
//            if (message.getCode() == 6) {
//                g += 1;
//            }
//            if (message.getCode() == 7) {
//                h += 1;
//            }
//            if (message.getCode() == 8) {
//                i += 1;
//            }
//            if (message.getCode() == 9) {
//                j += 1;
//            }
//        }
//        System.out.println("0" + a);
//        System.out.println("9" + j);
    }

    public static int uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль
        Set<Message> uniqueMessages = new HashSet<>(messageList);
        return uniqueMessages.size();



    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        Set<Message> uniqueMessages = new LinkedHashSet<>(messageList);
        messageList.stream().distinct().collect(Collectors.toList());
        messageList.stream().distinct().forEach(System.out::println);
        messageList.stream().distinct().map(Message::getPriority).collect(Collectors.toList());

        return  new ArrayList<>(uniqueMessages);

    }

    public static List<Message> copyEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на каждое сообщение с заданным приоритетом
        //  метод должен вернуть новую коллекцию
        ArrayList<Message> copy = new ArrayList<>();
        for (Message message : messageList) {
            if (message.getPriority().equals(priority)) {
                copy.add(message);
            }
        }
        System.out.println(copy);
        return null;
    }

    public static List<Message> copyOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: создать коллекцию и передать в нее ссылки на все сообщения, кроме тех, которые имеют заданный приоритет
        //  метод должен вернуть новую коллекцию
        ArrayList<Message> copy = new ArrayList<>();
        for (Message message : messageList) {
            if (!(message.getPriority().equals(priority))) {
                copy.add(message);
            }
        }
        System.out.println(copy);
        return null;
    }

    public static void main(String[] args) {
        List<Message> messages = Message.MessageGenerator.generate(34);
//        Message message1 = new Message(1, Message.MessagePriority.HIGH);
//        Message message2 = new Message(2, Message.MessagePriority.LOW);
//        Message message3 = new Message(1, Message.MessagePriority.LOW);
        System.out.println(messages);
        countEachPriority(messages);
        countEachCode(messages);

        copyEach(messages, Message.MessagePriority.HIGH);
        copyOther(messages, Message.MessagePriority.HIGH);



    }

}
