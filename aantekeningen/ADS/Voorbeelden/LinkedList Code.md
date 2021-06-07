```java
public class LinkedVogelbekdierList{
    public int size = 0;
    VogelbekdierNode first;
    VogelbekdierNode last;

    public boolean contains(Vogelbekdier vogelbekdier){
        if (size < 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            var temp = first;
            for (int i = 0; i < size; i++) {
                if (temp.vogelbekdier.naam.equals(vogelbekdier.naam)){
                    return true;
                }
                else {
                    temp = temp.next;
                }
            }
            return false;
        }
    }

    public Vogelbekdier get(int index){
        if (index > size -1){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            VogelbekdierNode node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node.vogelbekdier;
        }
    }

    public void set(int index, Vogelbekdier vogelbekdier){
        if (index > size -1){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            VogelbekdierNode node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            node.vogelbekdier = vogelbekdier;
        }
    }

    public void add(ads_week2.Vogelbekdier vogelbekdier){
        if (size == 0){
            first = new VogelbekdierNode(vogelbekdier);
            last = first;
            size++;
        }
        else{
            var newnode = new VogelbekdierNode(vogelbekdier);
            last.next = newnode;
            last = newnode;
            size++;
        }
    }

    public void add(int index, Vogelbekdier vogelbekdier){
        if (index > size -1){
            throw new ArrayIndexOutOfBoundsException();
        }
        else{
            VogelbekdierNode node = first;
            if (index == 0){
                var temp = first.next;
                first = new VogelbekdierNode(vogelbekdier);
                first.next = temp;
                size++;
            }else {
                for (int i = 0; i < index -1; i++) {
                    node = node.next;
                }
                var temp = node.next;
                node.next = new VogelbekdierNode(vogelbekdier);
                node.next.next = temp;
                size++;
            }
        }
    }

    public void remove(int index){
        if (index > size -1){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index == size -1){
            VogelbekdierNode node = first;
            for (int i = 0; i < index; i++) {
                if (i == index -1){
                    last = node;
                    node = node.next;
                    node.next = null;
                }else
                    node = node.next;
            }
            System.out.println("newlast " + last.vogelbekdier.naam);
            System.out.println("remove to null " + node.vogelbekdier.naam);
            node = null;

            size--;
        }
        else{
            VogelbekdierNode node = first;
            for (int i = 0; i < index -1; i++) {
                node = node.next;
            }
            System.out.println("remove " + node.next.vogelbekdier.naam);
            node.next = node.next.next;
            size--;
        }
    }

}

class VogelbekdierNode{
    public VogelbekdierNode(Vogelbekdier vogelbekdier){
        this.vogelbekdier = vogelbekdier;
    }
    public Vogelbekdier vogelbekdier;
    public VogelbekdierNode next;
}
```