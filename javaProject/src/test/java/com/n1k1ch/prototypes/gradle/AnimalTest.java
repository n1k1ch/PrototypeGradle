package com.n1k1ch.prototypes.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void canConstructAnAnimalWithAName() {
        Animal animal = new Animal();
		animal.setBreed("Schenock");
		
		assertEquals("Schenock", animal.getBreed());
    }
}
