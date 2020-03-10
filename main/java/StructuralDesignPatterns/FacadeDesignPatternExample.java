package StructuralDesignPatterns;

public class FacadeDesignPatternExample {
	public static void main(String[] args) {
        ZooKeeper zookeeper = new ZooKeeper();
        
        zookeeper.feedLion();
        zookeeper.feedHorse();
        zookeeper.feedBear();        
    }

}
