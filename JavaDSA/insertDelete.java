import java.util.*;
 class insertDelete {
 Map<Integer,Integer>map;
 List<Integer> list;
 Random rand;

 
    public insertDelete(){
        map = new HashMap<>();
        list = new ArrayList<>();
        rand = new Random();
}
    public boolean insert(int val){
        if(map.containsKey(val)) return false;
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    public boolean Remove(int val){
        if(!map.containsKey(val)) return false;
        int index = map.get(val);
        int LastIndex = list.get(list.size()-1);
        list.set(index,LastIndex);
        map.put(index, LastIndex);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    public int getRandom(){
        return list.get(rand.nextInt(list.size()));
    }

    
        public static void main(String[] args) {
            insertDelete randomizedSet = new insertDelete();
            
            System.out.println(randomizedSet.insert(1)); // true
            System.out.println(randomizedSet.Remove(2)); // false
            System.out.println(randomizedSet.insert(2)); // true
            System.out.println(randomizedSet.getRandom()); // 1 or 2 randomly
            System.out.println(randomizedSet.Remove(1)); // true
            System.out.println(randomizedSet.insert(2)); // false
            System.out.println(randomizedSet.getRandom()); // 2
        }
    }


