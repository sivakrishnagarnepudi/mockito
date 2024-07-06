package model;

import java.util.ArrayList;
import java.util.List;

public class NodeService {
    public static void main(String[] args) {
        Node a =new Node();
        System.out.println(a.data="Venkateswarao");
        System.out.println();
        List<Node> achild=new ArrayList<>();
        System.out.println(achild);
        Node b=new Node();
        System.out.println(b.data="Ramarao");
        Node c=new Node();
        System.out.println(c.data="Satayanarana");
        System.out.println(achild.add(b)+"DEVA"); achild.add(b);
        achild.add(c);
        System.out.println(a.children=achild); a.children=achild;
        List<Node>bchild=new ArrayList<>();
        Node d=new Node();
        Node e=new Node();
        bchild.add(d);
        bchild.add(e);
        b.children=bchild;
        List<Node>dchild=new ArrayList<>();
        Node f=new Node();
        Node g=new Node();
        dchild.add(f);
        dchild.add(g);
        d.children=dchild;
    }
}
