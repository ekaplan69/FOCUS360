package at.sozvers.noegkk.focus.service.patchnotes;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import jakarta.inject.Inject;
import org.slf4j.Logger;

public class PatchnotesService {
  @Inject
  private Logger log;

  public List<String> readPatchnotes() {
	String       file       = "/patchnotes.csv";
	List<String> patchnotes = new ArrayList<>();

	try(BufferedReader br = new BufferedReader(new InputStreamReader(Objects.requireNonNull(PatchnotesService.class.getResourceAsStream(file)), StandardCharsets.UTF_8))) {
	  String currentLine = br.readLine();
	  while(currentLine != null) {
		patchnotes.add(currentLine);
		currentLine = br.readLine();
	  }
	} catch(IOException e) {
	  log.error(e.getMessage());
	}
	return patchnotes;
  }
}
