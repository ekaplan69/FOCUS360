package at.sozvers.noegkk.focus.service.zpv.infrastructure;

import java.io.IOException;
import at.sozvers.noegkk.focus.service.common.MessageProvider;
import at.sozvers.noegkk.focus.service.context.Messages;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class ZpvCaller<I, O> {

  private static final Logger log = LoggerFactory.getLogger(ZpvCaller.class);

  @Inject
  private MessageProvider messageProvider;
  @Inject
  private Messages        messages;

  public O call(ThrowingFunction<I, O, Exception> f, I inputList) throws Exception {
	return call(f, inputList, false);
  }

  public O call(ThrowingFunction<I, O, Exception> f, I inputList, boolean ignoreMessages) throws Exception {

	O out;
	try {
	  out = f.apply(inputList);
	} catch(Exception e) {
	  log.warn(e.getMessage(), e);
	  throw new IOException(messageProvider.getMessage("error.subsystem.notreachable"));
	}

	if(!ignoreMessages) {
	  messages.addMessage(out);
	}

	return out;
  }
}
