package graphsChapter6;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.util.Arrays.asList;

public class Tester {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Seller peggy = new Seller("peggy", false);
        Seller quentin = new Seller("quentin", false);
        Seller alice = new Seller("alice", false);
        Seller me = new Seller("me", false);
        Seller bob = new Seller("bob", false);
        Seller anuj = new Seller("anuj", true);
        Seller thom = new Seller("thom", false);
        Seller jonny = new Seller("jonny", false);
        Seller claire = new Seller("claire", false);

        List<Seller> aliceConnections = asList(peggy, quentin);
        List<Seller> meConnections = asList(alice, bob, claire);
        List<Seller> bobConnections = asList(anuj, peggy);
        List<Seller> claireConnections = asList(thom, jonny);
        List<Seller> anujConnections = Collections.emptyList();
        List<Seller> peggyConnections = Collections.emptyList();
        List<Seller> thomConnections = Collections.emptyList();
        List<Seller> jonnyConnections = Collections.emptyList();

        graph.setConnections(alice, aliceConnections);
        graph.setConnections(me, meConnections);
        graph.setConnections(bob, bobConnections);
        graph.setConnections(claire, claireConnections);
        graph.setConnections(anuj, anujConnections);
        graph.setConnections(peggy, peggyConnections);
        graph.setConnections(thom, thomConnections);
        graph.setConnections(jonny, jonnyConnections);

        //System.out.println(graph);

        Queue<Seller> sellerQueue = new LinkedList<>();
        sellerQueue.add(me);
        List<Seller> checked = new LinkedList<>();
        boolean trigger = true;
        while (!sellerQueue.isEmpty()) {
            Seller seller = sellerQueue.poll();
            if(!checked.contains(seller)){
                if (seller.isMangoSeller()) {
                    System.out.println("Person " + seller.getName() + " is Mango seller!");
                    trigger = false;
                    checked.clear();
                    break;
                } else {
                    sellerQueue.addAll(graph.getConnections(seller));
                    checked.add(seller);
                }
            }
        }
        if (trigger){
            System.out.println("Mango seller not found!");
        }

    }
}
