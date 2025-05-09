package at.sozvers.noegkk.focus.testresources.testdb;

import jakarta.faces.context.FacesContext;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public abstract class ContextMocker extends FacesContext {
  private static final Release RELEASE = new Release();

  private ContextMocker() {
  }

  public static FacesContext mockFacesContext() {
	FacesContext context = Mockito.mock(FacesContext.class);
	setCurrentInstance(context);
	Mockito.doAnswer(RELEASE).when(context).release();
	return context;
  }

  private static class Release implements Answer<Void> {
	@Override
	public Void answer(InvocationOnMock invocation) {
	  setCurrentInstance(null);
	  return null;
	}
  }
}
