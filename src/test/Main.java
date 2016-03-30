package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<AudioFile> audioFiles = new ArrayList<>();
		audioFiles.add(new AudioFile("Album"));
		audioFiles.stream().forEach(file -> System.out.println(file));


		EncryptCezar enc = new EncryptCezar(audioFiles.toString(), 1);
		System.out.println(enc.getEncText());
		
		DecryptionCezar dec = new DecryptionCezar(enc.getEncText(), enc.getK());
		System.out.println(dec.getDecText());

		audioFiles.stream().findAny();
	}
}
