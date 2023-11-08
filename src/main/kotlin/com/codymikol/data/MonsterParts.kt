package com.codymikol.data

import com.codymikol.enums.Category
import com.codymikol.enums.Creature
import com.codymikol.enums.Segment

object MonsterParts {

    val data = listOf(

        // Zombie

        MonsterPart(
            src = "/assets/images/zombie/zombie-head.png",
            id = "zombie-head",
            category = Category.MONSTER,
            creature = Creature.ZOMBIE,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/zombie/zombie-torso.png",
            id = "zombie-torso",
            category = Category.MONSTER,
            creature = Creature.ZOMBIE,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/zombie/zombie-legs.png",
            id = "zombie-leg",
            category = Category.MONSTER,
            creature = Creature.ZOMBIE,
            segment = Segment.LEGS,
        ),

        // Ghost

        MonsterPart(
            src = "/assets/images/ghost/ghost-head.png",
            id = "ghost-head",
            category = Category.MONSTER,
            creature = Creature.GHOST,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/ghost/ghost-torso.png",
            id = "ghost-torso",
            category = Category.MONSTER,
            creature = Creature.GHOST,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/ghost/ghost-legs.png",
            id = "ghost-leg",
            category = Category.MONSTER,
            creature = Creature.GHOST,
            segment = Segment.LEGS,
        ),

        // Vampire

        MonsterPart(
            src = "/assets/images/vampire/vampire-head.png",
            id = "vampire-head",
            category = Category.MONSTER,
            creature = Creature.VAMPIRE,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/vampire/vampire-torso.png",
            id = "vampire-torso",
            category = Category.MONSTER,
            creature = Creature.VAMPIRE,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/vampire/vampire-legs.png",
            id = "vampire-leg",
            category = Category.MONSTER,
            creature = Creature.VAMPIRE,
            segment = Segment.LEGS,
        ),

        // Werewolf

        MonsterPart(
            src = "/assets/images/werewolf/werewolf-head.png",
            id = "werewolf-head",
            category = Category.MONSTER,
            creature = Creature.WEREWOLF,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/werewolf/werewolf-torso.png",
            id = "werewolf-torso",
            category = Category.MONSTER,
            creature = Creature.WEREWOLF,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/werewolf/werewolf-legs.png",
            id = "werewolf-leg",
            category = Category.MONSTER,
            creature = Creature.WEREWOLF,
            segment = Segment.LEGS,
        ),

        // Witch

        MonsterPart(
            src = "/assets/images/witch/witch-head.png",
            id = "witch-head",
            category = Category.MONSTER,
            creature = Creature.WITCH,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/witch/witch-torso.png",
            id = "witch-torso",
            category = Category.MONSTER,
            creature = Creature.WITCH,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/witch/witch-legs.png",
            id = "witch-leg",
            category = Category.MONSTER,
            creature = Creature.WITCH,
            segment = Segment.LEGS,
        ),

        // Astronaut

        MonsterPart(
            src = "/assets/images/astronaut-head.png",
            id = "astronaut-head",
            category = Category.OCCUPATION,
            creature = Creature.ASTRONAUT,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/astronaut-torso.png",
            id = "astronaut-torso",
            category = Category.OCCUPATION,
            creature = Creature.ASTRONAUT,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/astronaut-legs.png",
            id = "astronaut-leg",
            category = Category.OCCUPATION,
            creature = Creature.ASTRONAUT,
            segment = Segment.LEGS,
        ),

        // Teacher

        MonsterPart(
            src = "/assets/images/teacher-head.png",
            id = "teacher-head",
            category = Category.OCCUPATION,
            creature = Creature.TEACHER,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/teacher-torso.png",
            id = "teacher-torso",
            category = Category.OCCUPATION,
            creature = Creature.TEACHER,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/teacher-legs.png",
            id = "teacher-leg",
            category = Category.OCCUPATION,
            creature = Creature.TEACHER,
            segment = Segment.LEGS,
        ),

        // Plumber

        MonsterPart(
            src = "/assets/images/plumber-head.png",
            id = "plumber-head",
            category = Category.OCCUPATION,
            creature = Creature.PLUMBER,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/plumber-torso.png",
            id = "plumber-torso",
            category = Category.OCCUPATION,
            creature = Creature.PLUMBER,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/plumber-legs.png",
            id = "plumber-leg",
            category = Category.OCCUPATION,
            creature = Creature.PLUMBER,
            segment = Segment.LEGS,
        ),

        // Programmer

        MonsterPart(
            src = "/assets/images/programmer-head.png",
            id = "programmer-head",
            category = Category.OCCUPATION,
            creature = Creature.PROGRAMMER,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/programmer-torso.png",
            id = "programmer-torso",
            category = Category.OCCUPATION,
            creature = Creature.PROGRAMMER,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/programmer-legs.png",
            id = "programmer-leg",
            category = Category.OCCUPATION,
            creature = Creature.PROGRAMMER,
            segment = Segment.LEGS,
        ),

        // Artist

        MonsterPart(
            src = "/assets/images/artist-head.png",
            id = "artist-head",
            category = Category.OCCUPATION,
            creature = Creature.ARTIST,
            segment = Segment.HEAD,
        ),

        MonsterPart(
            src = "/assets/images/artist-torso.png",
            id = "artist-torso",
            category = Category.OCCUPATION,
            creature = Creature.ARTIST,
            segment = Segment.TORSO,
        ),

        MonsterPart(
            src = "/assets/images/artist-legs.png",
            id = "artist-leg",
            category = Category.OCCUPATION,
            creature = Creature.ARTIST,
            segment = Segment.LEGS,
        ),

        )

}