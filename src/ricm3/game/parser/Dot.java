package ricm3.game.parser;

public final class Dot {

		public static String graph(String name, String content) {
			String output = new String();
			output += "digraph " + name + "{" ;
			output += "\n" + "node[shape=box, fontsize=16, color=gray];" ;
			output += "\n" + content ;
			output += "\n}" ; 
			return output ;
		}
		public static String subgraph(int id, String content){
			String output = new String();
			output += "\nsubgraph cluster" + id ;
			output += "{ style=filled ; color=lightgrey ;\n" ;
			output += "\n" + content ;
			output += "}\n" ;
			return output ;
		}
		public static String name(String string) {
			return "\"" + string + "\"" ;
		}
		public static String node_id(int i) {
			return name(""+ i) ;
		}
		public static String node_label(String label, String options) {
			return " [label=" + name(label) + ", " + options + "]" ;
		}
		public static String declare_node(String id, String label, String options){
			return "\n" + id + node_label(label, options) + ";" ;
		}
		public static String edge(String id1, String id2) {
			return "\n" + id1 + " -> " + id2 + ";" ;
		}
}
