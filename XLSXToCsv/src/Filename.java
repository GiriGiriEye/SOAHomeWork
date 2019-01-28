
public enum Filename {
	ActionAnimeExtension("D:\\git_repo\\DesignerWork\\designer\\Excel\\Role\\ActionAnimeExtension.xlsx"),
	ActionAnimeExtensionCSV("D:\\git_repo\\DesignerWork\\designer\\Excel\\Csv\\ActionAnimeExtension.csv");
	
	private String filepath;
	
	private Filename(String filepath) {
		this.filepath = filepath;
	}
	
	public String getFilepath() {
		return this.filepath;
	}
	
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
}
