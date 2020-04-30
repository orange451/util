package scripts.util.names;

import com.allatori.annotations.DoNotRename;

import scripts.util.misc.NameFormatter;

@DoNotRename
public enum Quests {
	// Finished
	TUTORIAL_ISLAND(281, 680), 
	COOKS_ASSISTANT(29, 2), 
	ERNEST_THE_CHICKEN(32, 3), 
	WITCHS_POTION(67, 3), 
	SHEEP_SHEARER(179, 21), 
	THE_RESTLESS_GHOST(107, 5), 
	RUNE_MYSTERIES(63, 6), 
	
	// TODO
	ABYSS_SUBQUEST(492), 
	BLACK_KNIGHTS_FORTRESS(130),
	DEMON_SLAYER(222), 
	DORICS_QUEST(31), 
	DRAGON_SLAYER(176), 
	GOBLIN_DIPLOMACY(62), 
	IMP_CATCHER(160), 
	THE_KNIGHTS_SWORD(122), 
	PIRATES_TREASURE(160), 
	PRINCE_ALI_RESCUE(273), 
	ROMEO_AND_JULIET(144), 
	SHIELD_OF_ARRAV(145), 
	VAMPIRE_SLAYER(178), 
	ANIMAL_MAGNETISM(939), 
	ANOTHER_SLICE_OF_HAM(997), 
	BETWEEN_A_ROCK(433), 
	BIG_CHOMPY_BIRD_HUNTING(293), 
	BIOHAZARD(68), 
	CABIN_FEVER(655), 
	CLOCK_TOWER(10), 
	COLD_WAR(968), 
	CONTACT(964), 
	CREATURE_OF_FENKENSTRAIN(399), 
	DARKNESS_OF_HALLOWVALE(869), 
	DEATH_PLATEAU(314), 
	DEATH_TO_THE_DORGESHUUN(794), 
	DESERT_TREASURE(440), 
	DEVIOUS_MINDS(622), 
	THE_DIGSITE(131), 
	DREAM_MENTOR(1003), 
	DRUIDIC_RITUAL(80), 
	DWARF_CANNON(0), 
	EADGARS_RUSE(335), 
	EAGLES_PEAK(934), 
	ELEMENTAL_WORKSHOP_I(299), 
	ELEMENTAL_WORKSHOP_II(896), 
	ENAKHRAS_LAMENT(641), 
	ENLIGHTENTED_JOURNEY(912), 
	THE_EYES_OF_GLOUPHRIE(844), 
	FAIRYTALE_I(671), 
	FAIRYTALE_II(810), 
	FAMILY_CREST(148), 
	THE_FEUD(435), 
	FIGHT_ARENA(17), 
	FISHING_CONTEST(11), 
	FORGETTABLE_TALE(521), 
	THE_FREMMENIK_ISLES(970), 
	THE_FREMMENIK_TRIALS(347), 
	GARDEN_OF_TRANQUILITY(188), 
	GERTRUDES_CAT(180), 
	GHOSTS_AHOY(408), 
	THE_GIANT_DWARF(482), 
	THE_GOLEM(437), 
	THE_GRAND_TREE(150), 
	THE_GREAT_BRAIN_ROBBERY(980), 
	GRIM_TALES(1016), 
	THE_HAND_IN_THE_SAND(635), 
	HAUNTED_MINE(382), 
	HAZEEL_CULT(223), 
	HEROES_QUEST(188), 
	HOLY_GRAIL(5), 
	HORROR_FROM_THE_DEEP(351), 
	ICTHLARINS_LITTLE_HELPER(445), 
	IN_AID_OF_THE_MYREQUE(705), 
	IN_SEARCH_OF_THE_MYREQUE(387), 
	JUNGLE_POTION(175), 
	KINGS_RANSOM(1049), 
	LEGENDS_QUEST(139), 
	LOST_CITY(147), 
	THE_LOST_TRIBE(465), 
	LUNAR_DIPLOMACY(823), 
	MAKING_HISTORY(604), 
	MERLINS_CRYSTAL(14), 
	MONKS_FRIEND(30), 
	MONKEY_MADNESS(365), 
	MOUNTAIN_DAUGHTER(423), 
	MOURNINGS_END_PART_I(517), 
	MOURNINGS_END_PART_II(574), 
	MURDER_MYSTERY(192), 
	MY_ARMS_BIG_ADVENTURE(905), 
	NATURE_SPIRIT(307), 
	OBSERVATORY_QUEST(112), 
	OLAFS_QUEST(994), 
	ONE_SMALL_FAVOUR(416), 
	PLAGUE_CITY(165), 
	PRIEST_IN_PERIL(302), 
	RAG_AND_BONE_MAN(714), 
	RAT_CATCHERS(607), 
	RECIPE_FOR_DISASTER(1333333337), 
	RECRUITMENT_DRIVE(496), 
	REGICIDE(328), 
	ROVING_ELVES(402), 
	ROYAL_TROUBLE(730), 
	RUM_DEAL(600), 
	SCORPION_CATCHER(76), 
	SEA_SLUG(159), 
	SHADES_OF_MORTTON(339), 
	SHADOW_OF_THE_STORM(602), 
	SHEEP_HERDER(60), 
	SHILO_VILLAGE(116), 
	THE_SLUG_MENACE(874), 
	A_SOULS_BANE(709), 
	SPIRITS_OF_THE_ELID(616), 
	SWAN_SONG(723), 
	TAI_BWO_WANNAI_TRIO(320), 
	A_TAIL_OF_TWO_CATS(568), 
	TEARS_OF_GUTHIX(499), 
	TEMPLE_OF_IKOV(26), 
	THRONE_OF_MISCELLANIA(359), 
	THE_TOURIST_TRAP(197), 
	TOWER_OF_LIFE(977), 
	TREE_GNOME_VILLAGE(111), 
	TRIBAL_TOTEM(200), 
	TROLL_ROMANCE(385), 
	TROLL_STRONGHOLD(317), 
	UNDERGROUND_PASS(161), 
	WANTED(571), 
	WATCHTOWER(212), 
	WATERFALL_QUEST(65), 
	WHAT_LIES_BELOW(499), 
	WITCHS_HOUSE(226), 
	ZOGRE_FLESH_EATERS(455);

	private int interfaceId;
	private int finish;

	private Quests(int id) {
		this(id, 2);
	}

	private Quests(int id, int finish) {
		this.interfaceId = id;
		this.finish = finish;
	}

	public int getId() {
		return this.interfaceId;
	}

	public int getFinished() {
		return this.finish;
	}

	public String getName() {
		return NameFormatter.get(toString());
	}
}
