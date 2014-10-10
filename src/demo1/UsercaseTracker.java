package demo1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 6/13/14  4:49 PM
 * Created by JustinZhang.
 */
public class UsercaseTracker {

    public static void trackUseCase(List<Integer>usecases,Class<?> clazz){
        Method[] methods = clazz.getDeclaredMethods();

        for(Method m :methods){
            UseCase useCase = m.getAnnotation(UseCase.class);
            if(useCase!=null) {
                System.out.println("Found Use Case: "+useCase.id()+" "+useCase.description());
                usecases.remove(new Integer(useCase.id()));
            }
        }

        for(Integer i :usecases){
            System.out.println("warning missing usecase:"+i+"\n");
        }
    }

    public static void main(String[] args) {
        /*
        List<Integer> usecases = new ArrayList<Integer>();
        Collections.addAll(usecases, 48, 49, 50,51,52,53);
        trackUseCase(usecases,demo1.PasswordUtils.class);
        */
        List<String > strs = new ArrayList<String>();
        for (int i  = 0 ; i< Integer.MAX_VALUE; i++){
            String s = i+"";
            strs.add(s);
            System.out.println(s);
        }
        System.out.println(strs.size());
    }
}
