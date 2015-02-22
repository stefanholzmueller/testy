package stefanholzmueller.testy.examples;

import stefanholzmueller.testy.api.Action;
import stefanholzmueller.testy.api.CompositeStep;

public class NoErrorAction extends CompositeStep {

	public NoErrorAction(Action action) {
		super(action, new NoErrorValidation());
	}

}
