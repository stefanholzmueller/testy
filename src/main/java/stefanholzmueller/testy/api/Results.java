package stefanholzmueller.testy.api;

public enum Results implements Result {
	OK() {
		@Override
		public boolean isSuccessful() {
			return true;
		}
	}
}
