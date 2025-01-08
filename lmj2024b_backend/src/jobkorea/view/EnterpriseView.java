package jobkorea.view;

public class EnterpriseView {
	// + 싱글톤
	private static EnterpriseView instance = new EnterpriseView();
	private EnterpriseView() {}
	public static EnterpriseView getinstance() { return instance; }
	// - 싱글톤
}
