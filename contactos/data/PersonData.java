package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import entities.Person;

public class PersonData {
    List<Person> lis= new ArrayList<Person>();
    int id=0;
    public void create(Person p) {
        p.setId(++id);
        lis.add(p);
    }
    public List<Person> list(String filter) {
        return lis;
    }
    public Person get(int id) {
        int index=0;
        for (Person d : lis) {
            if (d.getId() == id ) {
                return lis.get(index);
            }
            index++;
        }
        return null;
    }
    // update(Person, int): void
    public void delete(int id) {
        Iterator<Person> iterator = lis.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
            }
        }
        
    }

    public void update (Person p){
        int index=0;
        
        for (Person d: lis){
            if(d.getId()==p.getId()){
                
                lis.set(index, p);
            
                
                break;
            }
            index++;
        }
    }
   

}
