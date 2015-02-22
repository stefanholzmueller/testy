package stefanholzmueller.testy.library;

import stefanholzmueller.testy.api.Action;
import stefanholzmueller.testy.api.CompositeStep;
import stefanholzmueller.testy.api.Result;
import stefanholzmueller.testy.examples.NoErrorValidation;

public class NoErrorAction extends CompositeStep<Result> {

	public NoErrorAction(Action action) {
		super(action, new NoErrorValidation());
	}

}
