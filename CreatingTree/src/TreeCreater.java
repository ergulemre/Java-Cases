import java.util.ArrayList;
import java.util.List;

public class TreeCreater {

	public static void main(String[] args) {
		
		int totalSteps = 5;
		String tree = createTree("*",totalSteps);
		System.out.println(tree);
	}
	
	public static String createTree(String nodeItem, int numOfSteps) {
		
		List<String> nodeList = new ArrayList<String>();
		int i = 0;
		while(nodeList.size()<numOfSteps) {
			if(i%2!=0) {
				nodeList.add(nodeItem.repeat(i));
			}
			i++;
		}
		String tree = "";
		for(String item : nodeList) {
			tree+=item+"\n";
		}
		return tree;
	}

}
