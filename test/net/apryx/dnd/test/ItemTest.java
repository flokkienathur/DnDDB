package net.apryx.dnd.test;

import static org.junit.Assert.*;

import org.junit.Test;

import net.apryx.dnd.items.Property;
import net.apryx.dnd.items.PropertyValue;
import net.apryx.dnd.items.Weapon;
import net.apryx.dnd.items.Weapon.Damage;
import net.apryx.dnd.items.Weapon.Damage.DamageType;

public class ItemTest {

	@Test
	public void testWeaponEquals() {
		Weapon longsword = new Weapon(1, "Longsword", 17, "A long, default sword.",
				new Damage(1,8,DamageType.SLASHING),
				
				new PropertyValue(Property.VERSATILE, new Damage(1,10,DamageType.SLASHING))
				);
		Weapon longsword2 = new Weapon(1, "Longsword", 17, "A long, default sword.",
				new Damage(1,8,DamageType.SLASHING),
				
				new PropertyValue(Property.VERSATILE, new Damage(1,10,DamageType.SLASHING))
				);
		assertTrue(longsword.equals(longsword2));
	}
	
	@Test
	public void testWeaponNotEquals() {
		Weapon longsword = new Weapon(1, "Longsword", 17, "A long, default sword.",
				new Damage(1,8,DamageType.SLASHING),
				
				new PropertyValue(Property.VERSATILE, new Damage(1,10,DamageType.SLASHING))
				);
		Weapon longsword2 = new Weapon(1, "Longsword", 17, "A long, default sword.",
				new Damage(1,8,DamageType.PIERCING),
				
				new PropertyValue(Property.VERSATILE, new Damage(1,10,DamageType.SLASHING))
				);

		assertFalse(longsword.equals(longsword2));
	}

}
