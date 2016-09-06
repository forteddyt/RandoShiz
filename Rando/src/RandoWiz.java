import java.util.Map;
import java.util.TreeMap;

public class RandoWiz
{

    public static void main(String[] args)
    {
        Map<GenericEnum, String> map = new TreeMap<GenericEnum, String>();
        System.out.println(map.get(GenericEnum.type1));
        map.put(GenericEnum.type2, "Type 2");
        System.out.println(map.get(GenericEnum.type2));
    }

}
