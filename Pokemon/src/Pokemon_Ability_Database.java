import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;

public class Pokemon_Ability_Database
{
	public static void main(String[] args) throws IOException
	{
		createAllAbilityConstructors("Sort Abilities.txt");
		//createAllAbilityObjects("Sort Abilities.txt");
		//createAllAbilities();
	}
	
	public static ArrayList<Pokemon_Ability_Constructor> createAllAbilities()
	{
		ArrayList<Pokemon_Ability_Constructor> allAbilities = new ArrayList<Pokemon_Ability_Constructor>();
		
		Pokemon_Ability_Constructor Adaptability = Adaptability();
		allAbilities.add(Adaptability);
		Pokemon_Ability_Constructor Aerilate = Aerilate();
		allAbilities.add(Aerilate);
		Pokemon_Ability_Constructor Aftermath = Aftermath();
		allAbilities.add(Aftermath);
		Pokemon_Ability_Constructor AirLock = AirLock();
		allAbilities.add(AirLock);
		Pokemon_Ability_Constructor Analytic = Analytic();
		allAbilities.add(Analytic);
		Pokemon_Ability_Constructor AngerPoint = AngerPoint();
		allAbilities.add(AngerPoint);
		Pokemon_Ability_Constructor Anticipation = Anticipation();
		allAbilities.add(Anticipation);
		Pokemon_Ability_Constructor ArenaTrap = ArenaTrap();
		allAbilities.add(ArenaTrap);
		Pokemon_Ability_Constructor AromaVeil = AromaVeil();
		allAbilities.add(AromaVeil);
		Pokemon_Ability_Constructor AuraBreak = AuraBreak();
		allAbilities.add(AuraBreak);
		Pokemon_Ability_Constructor BadDreams = BadDreams();
		allAbilities.add(BadDreams);
		Pokemon_Ability_Constructor BallFetch = BallFetch();
		allAbilities.add(BallFetch);
		Pokemon_Ability_Constructor Battery = Battery();
		allAbilities.add(Battery);
		Pokemon_Ability_Constructor BattleArmor = BattleArmor();
		allAbilities.add(BattleArmor);
		Pokemon_Ability_Constructor BattleBond = BattleBond();
		allAbilities.add(BattleBond);
		Pokemon_Ability_Constructor BeastBoost = BeastBoost();
		allAbilities.add(BeastBoost);
		Pokemon_Ability_Constructor Berserk = Berserk();
		allAbilities.add(Berserk);
		Pokemon_Ability_Constructor BigPecks = BigPecks();
		allAbilities.add(BigPecks);
		Pokemon_Ability_Constructor Blaze = Blaze();
		allAbilities.add(Blaze);
		Pokemon_Ability_Constructor Bulletproof = Bulletproof();
		allAbilities.add(Bulletproof);
		Pokemon_Ability_Constructor Cacophony = Cacophony();
		allAbilities.add(Cacophony);
		Pokemon_Ability_Constructor CheekPouch = CheekPouch();
		allAbilities.add(CheekPouch);
		Pokemon_Ability_Constructor Chlorophyll = Chlorophyll();
		allAbilities.add(Chlorophyll);
		Pokemon_Ability_Constructor ClearBody = ClearBody();
		allAbilities.add(ClearBody);
		Pokemon_Ability_Constructor CloudNine = CloudNine();
		allAbilities.add(CloudNine);
		Pokemon_Ability_Constructor ColorChange = ColorChange();
		allAbilities.add(ColorChange);
		Pokemon_Ability_Constructor Comatose = Comatose();
		allAbilities.add(Comatose);
		Pokemon_Ability_Constructor Competitive = Competitive();
		allAbilities.add(Competitive);
		Pokemon_Ability_Constructor CompoundEyes = CompoundEyes();
		allAbilities.add(CompoundEyes);
		Pokemon_Ability_Constructor Contrary = Contrary();
		allAbilities.add(Contrary);
		Pokemon_Ability_Constructor Corrosion = Corrosion();
		allAbilities.add(Corrosion);
		Pokemon_Ability_Constructor CottonDown = CottonDown();
		allAbilities.add(CottonDown);
		Pokemon_Ability_Constructor CursedBody = CursedBody();
		allAbilities.add(CursedBody);
		Pokemon_Ability_Constructor CuteCharm = CuteCharm();
		allAbilities.add(CuteCharm);
		Pokemon_Ability_Constructor Damp = Damp();
		allAbilities.add(Damp);
		Pokemon_Ability_Constructor Dancer = Dancer();
		allAbilities.add(Dancer);
		Pokemon_Ability_Constructor DarkAura = DarkAura();
		allAbilities.add(DarkAura);
		Pokemon_Ability_Constructor DauntlessShield = DauntlessShield();
		allAbilities.add(DauntlessShield);
		Pokemon_Ability_Constructor Dazzling = Dazzling();
		allAbilities.add(Dazzling);
		Pokemon_Ability_Constructor Defeatist = Defeatist();
		allAbilities.add(Defeatist);
		Pokemon_Ability_Constructor Defiant = Defiant();
		allAbilities.add(Defiant);
		Pokemon_Ability_Constructor DeltaStream = DeltaStream();
		allAbilities.add(DeltaStream);
		Pokemon_Ability_Constructor DesolateLand = DesolateLand();
		allAbilities.add(DesolateLand);
		Pokemon_Ability_Constructor Disguise = Disguise();
		allAbilities.add(Disguise);
		Pokemon_Ability_Constructor Download = Download();
		allAbilities.add(Download);
		Pokemon_Ability_Constructor Drizzle = Drizzle();
		allAbilities.add(Drizzle);
		Pokemon_Ability_Constructor Drought = Drought();
		allAbilities.add(Drought);
		Pokemon_Ability_Constructor DrySkin = DrySkin();
		allAbilities.add(DrySkin);
		Pokemon_Ability_Constructor EarlyBird = EarlyBird();
		allAbilities.add(EarlyBird);
		Pokemon_Ability_Constructor EffectSpore = EffectSpore();
		allAbilities.add(EffectSpore);
		Pokemon_Ability_Constructor ElectricSurge = ElectricSurge();
		allAbilities.add(ElectricSurge);
		Pokemon_Ability_Constructor EmergencyExit = EmergencyExit();
		allAbilities.add(EmergencyExit);
		Pokemon_Ability_Constructor FairyAura = FairyAura();
		allAbilities.add(FairyAura);
		Pokemon_Ability_Constructor Filter = Filter();
		allAbilities.add(Filter);
		Pokemon_Ability_Constructor FlameBody = FlameBody();
		allAbilities.add(FlameBody);
		Pokemon_Ability_Constructor FlareBoost = FlareBoost();
		allAbilities.add(FlareBoost);
		Pokemon_Ability_Constructor FlashFire = FlashFire();
		allAbilities.add(FlashFire);
		Pokemon_Ability_Constructor FlowerGift = FlowerGift();
		allAbilities.add(FlowerGift);
		Pokemon_Ability_Constructor FlowerVeil = FlowerVeil();
		allAbilities.add(FlowerVeil);
		Pokemon_Ability_Constructor Fluffy = Fluffy();
		allAbilities.add(Fluffy);
		Pokemon_Ability_Constructor Forecast = Forecast();
		allAbilities.add(Forecast);
		Pokemon_Ability_Constructor Forewarn = Forewarn();
		allAbilities.add(Forewarn);
		Pokemon_Ability_Constructor FriendGuard = FriendGuard();
		allAbilities.add(FriendGuard);
		Pokemon_Ability_Constructor Frisk = Frisk();
		allAbilities.add(Frisk);
		Pokemon_Ability_Constructor FullMetalBody = FullMetalBody();
		allAbilities.add(FullMetalBody);
		Pokemon_Ability_Constructor FurCoat = FurCoat();
		allAbilities.add(FurCoat);
		Pokemon_Ability_Constructor GaleWings = GaleWings();
		allAbilities.add(GaleWings);
		Pokemon_Ability_Constructor Galvanize = Galvanize();
		allAbilities.add(Galvanize);
		Pokemon_Ability_Constructor Gluttony = Gluttony();
		allAbilities.add(Gluttony);
		Pokemon_Ability_Constructor Gooey = Gooey();
		allAbilities.add(Gooey);
		Pokemon_Ability_Constructor GorillaTactics = GorillaTactics();
		allAbilities.add(GorillaTactics);
		Pokemon_Ability_Constructor GrassPelt = GrassPelt();
		allAbilities.add(GrassPelt);
		Pokemon_Ability_Constructor GrassySurge = GrassySurge();
		allAbilities.add(GrassySurge);
		Pokemon_Ability_Constructor GulpMissile = GulpMissile();
		allAbilities.add(GulpMissile);
		Pokemon_Ability_Constructor Guts = Guts();
		allAbilities.add(Guts);
		Pokemon_Ability_Constructor Harvest = Harvest();
		allAbilities.add(Harvest);
		Pokemon_Ability_Constructor Healer = Healer();
		allAbilities.add(Healer);
		Pokemon_Ability_Constructor Heatproof = Heatproof();
		allAbilities.add(Heatproof);
		Pokemon_Ability_Constructor HeavyMetal = HeavyMetal();
		allAbilities.add(HeavyMetal);
		Pokemon_Ability_Constructor HoneyGather = HoneyGather();
		allAbilities.add(HoneyGather);
		Pokemon_Ability_Constructor HugePower = HugePower();
		allAbilities.add(HugePower);
		Pokemon_Ability_Constructor HungerSwitch = HungerSwitch();
		allAbilities.add(HungerSwitch);
		Pokemon_Ability_Constructor Hustle = Hustle();
		allAbilities.add(Hustle);
		Pokemon_Ability_Constructor Hydration = Hydration();
		allAbilities.add(Hydration);
		Pokemon_Ability_Constructor HyperCutter = HyperCutter();
		allAbilities.add(HyperCutter);
		Pokemon_Ability_Constructor IceBody = IceBody();
		allAbilities.add(IceBody);
		Pokemon_Ability_Constructor IceFace = IceFace();
		allAbilities.add(IceFace);
		Pokemon_Ability_Constructor IceScales = IceScales();
		allAbilities.add(IceScales);
		Pokemon_Ability_Constructor Illuminate = Illuminate();
		allAbilities.add(Illuminate);
		Pokemon_Ability_Constructor Illusion = Illusion();
		allAbilities.add(Illusion);
		Pokemon_Ability_Constructor Immunity = Immunity();
		allAbilities.add(Immunity);
		Pokemon_Ability_Constructor Imposter = Imposter();
		allAbilities.add(Imposter);
		Pokemon_Ability_Constructor Infiltrator = Infiltrator();
		allAbilities.add(Infiltrator);
		Pokemon_Ability_Constructor InnardsOut = InnardsOut();
		allAbilities.add(InnardsOut);
		Pokemon_Ability_Constructor InnerFocus = InnerFocus();
		allAbilities.add(InnerFocus);
		Pokemon_Ability_Constructor Insomnia = Insomnia();
		allAbilities.add(Insomnia);
		Pokemon_Ability_Constructor Intimidate = Intimidate();
		allAbilities.add(Intimidate);
		Pokemon_Ability_Constructor IntrepidSword = IntrepidSword();
		allAbilities.add(IntrepidSword);
		Pokemon_Ability_Constructor IronBarbs = IronBarbs();
		allAbilities.add(IronBarbs);
		Pokemon_Ability_Constructor IronFist = IronFist();
		allAbilities.add(IronFist);
		Pokemon_Ability_Constructor Justified = Justified();
		allAbilities.add(Justified);
		Pokemon_Ability_Constructor KeenEye = KeenEye();
		allAbilities.add(KeenEye);
		Pokemon_Ability_Constructor Klutz = Klutz();
		allAbilities.add(Klutz);
		Pokemon_Ability_Constructor LeafGuard = LeafGuard();
		allAbilities.add(LeafGuard);
		Pokemon_Ability_Constructor Levitate = Levitate();
		allAbilities.add(Levitate);
		Pokemon_Ability_Constructor Libero = Libero();
		allAbilities.add(Libero);
		Pokemon_Ability_Constructor LightMetal = LightMetal();
		allAbilities.add(LightMetal);
		Pokemon_Ability_Constructor LightningRod = LightningRod();
		allAbilities.add(LightningRod);
		Pokemon_Ability_Constructor Limber = Limber();
		allAbilities.add(Limber);
		Pokemon_Ability_Constructor LiquidOoze = LiquidOoze();
		allAbilities.add(LiquidOoze);
		Pokemon_Ability_Constructor LiquidVoice = LiquidVoice();
		allAbilities.add(LiquidVoice);
		Pokemon_Ability_Constructor LongReach = LongReach();
		allAbilities.add(LongReach);
		Pokemon_Ability_Constructor MagicBounce = MagicBounce();
		allAbilities.add(MagicBounce);
		Pokemon_Ability_Constructor MagicGuard = MagicGuard();
		allAbilities.add(MagicGuard);
		Pokemon_Ability_Constructor Magician = Magician();
		allAbilities.add(Magician);
		Pokemon_Ability_Constructor MagmaArmor = MagmaArmor();
		allAbilities.add(MagmaArmor);
		Pokemon_Ability_Constructor MagnetPull = MagnetPull();
		allAbilities.add(MagnetPull);
		Pokemon_Ability_Constructor MarvelScale = MarvelScale();
		allAbilities.add(MarvelScale);
		Pokemon_Ability_Constructor MegaLauncher = MegaLauncher();
		allAbilities.add(MegaLauncher);
		Pokemon_Ability_Constructor Merciless = Merciless();
		allAbilities.add(Merciless);
		Pokemon_Ability_Constructor Mimicry = Mimicry();
		allAbilities.add(Mimicry);
		Pokemon_Ability_Constructor Minus = Minus();
		allAbilities.add(Minus);
		Pokemon_Ability_Constructor MirrorArmor = MirrorArmor();
		allAbilities.add(MirrorArmor);
		Pokemon_Ability_Constructor MistySurge = MistySurge();
		allAbilities.add(MistySurge);
		Pokemon_Ability_Constructor MoldBreaker = MoldBreaker();
		allAbilities.add(MoldBreaker);
		Pokemon_Ability_Constructor Moody = Moody();
		allAbilities.add(Moody);
		Pokemon_Ability_Constructor MotorDrive = MotorDrive();
		allAbilities.add(MotorDrive);
		Pokemon_Ability_Constructor Moxie = Moxie();
		allAbilities.add(Moxie);
		Pokemon_Ability_Constructor Multiscale = Multiscale();
		allAbilities.add(Multiscale);
		Pokemon_Ability_Constructor Multitype = Multitype();
		allAbilities.add(Multitype);
		Pokemon_Ability_Constructor Mummy = Mummy();
		allAbilities.add(Mummy);
		Pokemon_Ability_Constructor NaturalCure = NaturalCure();
		allAbilities.add(NaturalCure);
		Pokemon_Ability_Constructor Neuroforce = Neuroforce();
		allAbilities.add(Neuroforce);
		Pokemon_Ability_Constructor NeutralizingGas = NeutralizingGas();
		allAbilities.add(NeutralizingGas);
		Pokemon_Ability_Constructor NoGuard = NoGuard();
		allAbilities.add(NoGuard);
		Pokemon_Ability_Constructor Normalize = Normalize();
		allAbilities.add(Normalize);
		Pokemon_Ability_Constructor Oblivious = Oblivious();
		allAbilities.add(Oblivious);
		Pokemon_Ability_Constructor Overcoat = Overcoat();
		allAbilities.add(Overcoat);
		Pokemon_Ability_Constructor Overgrow = Overgrow();
		allAbilities.add(Overgrow);
		Pokemon_Ability_Constructor OwnTempo = OwnTempo();
		allAbilities.add(OwnTempo);
		Pokemon_Ability_Constructor ParentalBond = ParentalBond();
		allAbilities.add(ParentalBond);
		Pokemon_Ability_Constructor PastelVeil = PastelVeil();
		allAbilities.add(PastelVeil);
		Pokemon_Ability_Constructor PerishBody = PerishBody();
		allAbilities.add(PerishBody);
		Pokemon_Ability_Constructor Pickpocket = Pickpocket();
		allAbilities.add(Pickpocket);
		Pokemon_Ability_Constructor Pickup = Pickup();
		allAbilities.add(Pickup);
		Pokemon_Ability_Constructor Pixilate = Pixilate();
		allAbilities.add(Pixilate);
		Pokemon_Ability_Constructor Plus = Plus();
		allAbilities.add(Plus);
		Pokemon_Ability_Constructor PoisonHeal = PoisonHeal();
		allAbilities.add(PoisonHeal);
		Pokemon_Ability_Constructor PoisonPoint = PoisonPoint();
		allAbilities.add(PoisonPoint);
		Pokemon_Ability_Constructor PoisonTouch = PoisonTouch();
		allAbilities.add(PoisonTouch);
		Pokemon_Ability_Constructor PowerConstruct = PowerConstruct();
		allAbilities.add(PowerConstruct);
		Pokemon_Ability_Constructor PowerofAlchemy = PowerofAlchemy();
		allAbilities.add(PowerofAlchemy);
		Pokemon_Ability_Constructor PowerSpot = PowerSpot();
		allAbilities.add(PowerSpot);
		Pokemon_Ability_Constructor Prankster = Prankster();
		allAbilities.add(Prankster);
		Pokemon_Ability_Constructor Pressure = Pressure();
		allAbilities.add(Pressure);
		Pokemon_Ability_Constructor PrimordialSea = PrimordialSea();
		allAbilities.add(PrimordialSea);
		Pokemon_Ability_Constructor PrismArmor = PrismArmor();
		allAbilities.add(PrismArmor);
		Pokemon_Ability_Constructor PropellerTail = PropellerTail();
		allAbilities.add(PropellerTail);
		Pokemon_Ability_Constructor Protean = Protean();
		allAbilities.add(Protean);
		Pokemon_Ability_Constructor PsychicSurge = PsychicSurge();
		allAbilities.add(PsychicSurge);
		Pokemon_Ability_Constructor PunkRock = PunkRock();
		allAbilities.add(PunkRock);
		Pokemon_Ability_Constructor PurePower = PurePower();
		allAbilities.add(PurePower);
		Pokemon_Ability_Constructor QueenlyMajesty = QueenlyMajesty();
		allAbilities.add(QueenlyMajesty);
		Pokemon_Ability_Constructor QuickFeet = QuickFeet();
		allAbilities.add(QuickFeet);
		Pokemon_Ability_Constructor RainDish = RainDish();
		allAbilities.add(RainDish);
		Pokemon_Ability_Constructor Rattled = Rattled();
		allAbilities.add(Rattled);
		Pokemon_Ability_Constructor Receiver = Receiver();
		allAbilities.add(Receiver);
		Pokemon_Ability_Constructor Reckless = Reckless();
		allAbilities.add(Reckless);
		Pokemon_Ability_Constructor Refrigerate = Refrigerate();
		allAbilities.add(Refrigerate);
		Pokemon_Ability_Constructor Regenerator = Regenerator();
		allAbilities.add(Regenerator);
		Pokemon_Ability_Constructor Ripen = Ripen();
		allAbilities.add(Ripen);
		Pokemon_Ability_Constructor Rivalry = Rivalry();
		allAbilities.add(Rivalry);
		Pokemon_Ability_Constructor RKSSystem = RKSSystem();
		allAbilities.add(RKSSystem);
		Pokemon_Ability_Constructor RockHead = RockHead();
		allAbilities.add(RockHead);
		Pokemon_Ability_Constructor RoughSkin = RoughSkin();
		allAbilities.add(RoughSkin);
		Pokemon_Ability_Constructor RunAway = RunAway();
		allAbilities.add(RunAway);
		Pokemon_Ability_Constructor SandForce = SandForce();
		allAbilities.add(SandForce);
		Pokemon_Ability_Constructor SandRush = SandRush();
		allAbilities.add(SandRush);
		Pokemon_Ability_Constructor SandSpit = SandSpit();
		allAbilities.add(SandSpit);
		Pokemon_Ability_Constructor SandStream = SandStream();
		allAbilities.add(SandStream);
		Pokemon_Ability_Constructor SandVeil = SandVeil();
		allAbilities.add(SandVeil);
		Pokemon_Ability_Constructor SapSipper = SapSipper();
		allAbilities.add(SapSipper);
		Pokemon_Ability_Constructor Schooling = Schooling();
		allAbilities.add(Schooling);
		Pokemon_Ability_Constructor Scrappy = Scrappy();
		allAbilities.add(Scrappy);
		Pokemon_Ability_Constructor ScreenCleaner = ScreenCleaner();
		allAbilities.add(ScreenCleaner);
		Pokemon_Ability_Constructor SereneGrace = SereneGrace();
		allAbilities.add(SereneGrace);
		Pokemon_Ability_Constructor ShadowShield = ShadowShield();
		allAbilities.add(ShadowShield);
		Pokemon_Ability_Constructor ShadowTag = ShadowTag();
		allAbilities.add(ShadowTag);
		Pokemon_Ability_Constructor ShedSkin = ShedSkin();
		allAbilities.add(ShedSkin);
		Pokemon_Ability_Constructor SheerForce = SheerForce();
		allAbilities.add(SheerForce);
		Pokemon_Ability_Constructor ShellArmor = ShellArmor();
		allAbilities.add(ShellArmor);
		Pokemon_Ability_Constructor ShieldDust = ShieldDust();
		allAbilities.add(ShieldDust);
		Pokemon_Ability_Constructor ShieldsDown = ShieldsDown();
		allAbilities.add(ShieldsDown);
		Pokemon_Ability_Constructor Simple = Simple();
		allAbilities.add(Simple);
		Pokemon_Ability_Constructor SkillLink = SkillLink();
		allAbilities.add(SkillLink);
		Pokemon_Ability_Constructor SlowStart = SlowStart();
		allAbilities.add(SlowStart);
		Pokemon_Ability_Constructor SlushRush = SlushRush();
		allAbilities.add(SlushRush);
		Pokemon_Ability_Constructor Sniper = Sniper();
		allAbilities.add(Sniper);
		Pokemon_Ability_Constructor SnowCloak = SnowCloak();
		allAbilities.add(SnowCloak);
		Pokemon_Ability_Constructor SnowWarning = SnowWarning();
		allAbilities.add(SnowWarning);
		Pokemon_Ability_Constructor SolarPower = SolarPower();
		allAbilities.add(SolarPower);
		Pokemon_Ability_Constructor SolidRock = SolidRock();
		allAbilities.add(SolidRock);
		Pokemon_Ability_Constructor SoulHeart = SoulHeart();
		allAbilities.add(SoulHeart);
		Pokemon_Ability_Constructor Soundproof = Soundproof();
		allAbilities.add(Soundproof);
		Pokemon_Ability_Constructor SpeedBoost = SpeedBoost();
		allAbilities.add(SpeedBoost);
		Pokemon_Ability_Constructor Stakeout = Stakeout();
		allAbilities.add(Stakeout);
		Pokemon_Ability_Constructor Stall = Stall();
		allAbilities.add(Stall);
		Pokemon_Ability_Constructor Stalwart = Stalwart();
		allAbilities.add(Stalwart);
		Pokemon_Ability_Constructor Stamina = Stamina();
		allAbilities.add(Stamina);
		Pokemon_Ability_Constructor StanceChange = StanceChange();
		allAbilities.add(StanceChange);
		Pokemon_Ability_Constructor Static = Static();
		allAbilities.add(Static);
		Pokemon_Ability_Constructor Steadfast = Steadfast();
		allAbilities.add(Steadfast);
		Pokemon_Ability_Constructor SteamEngine = SteamEngine();
		allAbilities.add(SteamEngine);
		Pokemon_Ability_Constructor Steelworker = Steelworker();
		allAbilities.add(Steelworker);
		Pokemon_Ability_Constructor SteelySpirit = SteelySpirit();
		allAbilities.add(SteelySpirit);
		Pokemon_Ability_Constructor Stench = Stench();
		allAbilities.add(Stench);
		Pokemon_Ability_Constructor StickyHold = StickyHold();
		allAbilities.add(StickyHold);
		Pokemon_Ability_Constructor StormDrain = StormDrain();
		allAbilities.add(StormDrain);
		Pokemon_Ability_Constructor StrongJaw = StrongJaw();
		allAbilities.add(StrongJaw);
		Pokemon_Ability_Constructor Sturdy = Sturdy();
		allAbilities.add(Sturdy);
		Pokemon_Ability_Constructor SuctionCups = SuctionCups();
		allAbilities.add(SuctionCups);
		Pokemon_Ability_Constructor SuperLuck = SuperLuck();
		allAbilities.add(SuperLuck);
		Pokemon_Ability_Constructor SurgeSurfer = SurgeSurfer();
		allAbilities.add(SurgeSurfer);
		Pokemon_Ability_Constructor Swarm = Swarm();
		allAbilities.add(Swarm);
		Pokemon_Ability_Constructor SweetVeil = SweetVeil();
		allAbilities.add(SweetVeil);
		Pokemon_Ability_Constructor SwiftSwim = SwiftSwim();
		allAbilities.add(SwiftSwim);
		Pokemon_Ability_Constructor Symbiosis = Symbiosis();
		allAbilities.add(Symbiosis);
		Pokemon_Ability_Constructor Synchronize = Synchronize();
		allAbilities.add(Synchronize);
		Pokemon_Ability_Constructor TangledFeet = TangledFeet();
		allAbilities.add(TangledFeet);
		Pokemon_Ability_Constructor TanglingHair = TanglingHair();
		allAbilities.add(TanglingHair);
		Pokemon_Ability_Constructor Technician = Technician();
		allAbilities.add(Technician);
		Pokemon_Ability_Constructor Telepathy = Telepathy();
		allAbilities.add(Telepathy);
		Pokemon_Ability_Constructor Teravolt = Teravolt();
		allAbilities.add(Teravolt);
		Pokemon_Ability_Constructor ThickFat = ThickFat();
		allAbilities.add(ThickFat);
		Pokemon_Ability_Constructor TintedLens = TintedLens();
		allAbilities.add(TintedLens);
		Pokemon_Ability_Constructor Torrent = Torrent();
		allAbilities.add(Torrent);
		Pokemon_Ability_Constructor ToughClaws = ToughClaws();
		allAbilities.add(ToughClaws);
		Pokemon_Ability_Constructor ToxicBoost = ToxicBoost();
		allAbilities.add(ToxicBoost);
		Pokemon_Ability_Constructor Trace = Trace();
		allAbilities.add(Trace);
		Pokemon_Ability_Constructor Triage = Triage();
		allAbilities.add(Triage);
		Pokemon_Ability_Constructor Truant = Truant();
		allAbilities.add(Truant);
		Pokemon_Ability_Constructor Turboblaze = Turboblaze();
		allAbilities.add(Turboblaze);
		Pokemon_Ability_Constructor Unaware = Unaware();
		allAbilities.add(Unaware);
		Pokemon_Ability_Constructor Unburden = Unburden();
		allAbilities.add(Unburden);
		Pokemon_Ability_Constructor Unnerve = Unnerve();
		allAbilities.add(Unnerve);
		Pokemon_Ability_Constructor VictoryStar = VictoryStar();
		allAbilities.add(VictoryStar);
		Pokemon_Ability_Constructor VitalSpirit = VitalSpirit();
		allAbilities.add(VitalSpirit);
		Pokemon_Ability_Constructor VoltAbsorb = VoltAbsorb();
		allAbilities.add(VoltAbsorb);
		Pokemon_Ability_Constructor WanderingSpirit = WanderingSpirit();
		allAbilities.add(WanderingSpirit);
		Pokemon_Ability_Constructor WaterAbsorb = WaterAbsorb();
		allAbilities.add(WaterAbsorb);
		Pokemon_Ability_Constructor WaterBubble = WaterBubble();
		allAbilities.add(WaterBubble);
		Pokemon_Ability_Constructor WaterCompaction = WaterCompaction();
		allAbilities.add(WaterCompaction);
		Pokemon_Ability_Constructor WaterVeil = WaterVeil();
		allAbilities.add(WaterVeil);
		Pokemon_Ability_Constructor WeakArmor = WeakArmor();
		allAbilities.add(WeakArmor);
		Pokemon_Ability_Constructor WhiteSmoke = WhiteSmoke();
		allAbilities.add(WhiteSmoke);
		Pokemon_Ability_Constructor WimpOut = WimpOut();
		allAbilities.add(WimpOut);
		Pokemon_Ability_Constructor WonderGuard = WonderGuard();
		allAbilities.add(WonderGuard);
		Pokemon_Ability_Constructor WonderSkin = WonderSkin();
		allAbilities.add(WonderSkin);
		Pokemon_Ability_Constructor ZenMode = ZenMode();
		allAbilities.add(ZenMode);

		return allAbilities;
	}
	
	public static void createAllAbilityConstructors(String fileInput) throws IOException
	{
		File file = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = br.readLine()) != null)
		{
			String[] splitLine = line.split("/");
			String name = splitLine[0];
			String character = "'";
			String effect = splitLine[1].replace('"', character.toCharArray()[0]);
			String generation = splitLine[2];
			
			//System.out.println(name + "\t" + effect + "\t" + generation);

			System.out.println("public static Pokemon_Ability_Constructor " + name.replace(" ", "").replace("-", "") + "()");
			System.out.println("{");
			System.out.println("\t" + "Pokemon_Ability_Constructor " + name.replace(" ", "").replace("-", "") + " = new Pokemon_Ability_Constructor(" + '"' + name + '"' + ", "+ '"' + effect.trim() + '"' + ", "+ '"' + generation.trim() + '"' + ");");
			System.out.println("\t" + "return " + name.replace(" ", "").replace("-", "") + ";");
			System.out.println("}");
			System.out.println();
		}
	}
	
	public static void createAllAbilityObjects(String fileInput) throws IOException
	{
		File file = new File(fileInput);
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		
		
		while((line = br.readLine()) != null)
		{
			String[] lineArray = line.split("/");
			String name = lineArray[0].replace(" ", "").replace("-", "");
			
			System.out.println("Pokemon_Ability_Constructor " + name + " = " + name + "();");
			System.out.println("allAbilities.add(" + name + ");");
		}
	}
	
	public static Pokemon_Ability_Constructor Adaptability()
	{
		Pokemon_Ability_Constructor Adaptability = new Pokemon_Ability_Constructor("Adaptability", "Powers up moves of the same type as the pokemon.", "IV");
		return Adaptability;
	}

	public static Pokemon_Ability_Constructor Aerilate()
	{
		Pokemon_Ability_Constructor Aerilate = new Pokemon_Ability_Constructor("Aerilate", "normal-type moves become flying-type moves. The power of those moves is boosted a little.", "VI");
		return Aerilate;
	}

	public static Pokemon_Ability_Constructor Aftermath()
	{
		Pokemon_Ability_Constructor Aftermath = new Pokemon_Ability_Constructor("Aftermath", "Damages the attacker if it contacts the pokemon with a finishing hit.", "IV");
		return Aftermath;
	}

	public static Pokemon_Ability_Constructor AirLock()
	{
		Pokemon_Ability_Constructor AirLock = new Pokemon_Ability_Constructor("Air Lock", "Eliminates the effects of weather.", "III");
		return AirLock;
	}

	public static Pokemon_Ability_Constructor Analytic()
	{
		Pokemon_Ability_Constructor Analytic = new Pokemon_Ability_Constructor("Analytic", "Boosts move power when the pokemon moves last.", "V");
		return Analytic;
	}

	public static Pokemon_Ability_Constructor AngerPoint()
	{
		Pokemon_Ability_Constructor AngerPoint = new Pokemon_Ability_Constructor("Anger Point", "The pokemon is angered when it takes a critical hit, and that maxes its Attack stat.", "IV");
		return AngerPoint;
	}

	public static Pokemon_Ability_Constructor Anticipation()
	{
		Pokemon_Ability_Constructor Anticipation = new Pokemon_Ability_Constructor("Anticipation", "The pokemon can sense an opposing pokemon's dangerous moves.", "IV");
		return Anticipation;
	}

	public static Pokemon_Ability_Constructor ArenaTrap()
	{
		Pokemon_Ability_Constructor ArenaTrap = new Pokemon_Ability_Constructor("Arena Trap", "Prevents opposing pokemon from fleeing.", "III");
		return ArenaTrap;
	}

	public static Pokemon_Ability_Constructor AromaVeil()
	{
		Pokemon_Ability_Constructor AromaVeil = new Pokemon_Ability_Constructor("Aroma Veil", "Protects itself and its allies from attacks that limit their move choices.", "VI");
		return AromaVeil;
	}

	public static Pokemon_Ability_Constructor AuraBreak()
	{
		Pokemon_Ability_Constructor AuraBreak = new Pokemon_Ability_Constructor("Aura Break", "The effects of 'Aura' Abilities are reversed to lower the power of affected moves.", "VI");
		return AuraBreak;
	}

	public static Pokemon_Ability_Constructor BadDreams()
	{
		Pokemon_Ability_Constructor BadDreams = new Pokemon_Ability_Constructor("Bad Dreams", "Reduces the hp of sleeping opposing pokemon.", "IV");
		return BadDreams;
	}

	public static Pokemon_Ability_Constructor BallFetch()
	{
		Pokemon_Ability_Constructor BallFetch = new Pokemon_Ability_Constructor("Ball Fetch", "If the pokemon is not holding an item, it will fetch the poke Ball from the first failed throw of the battle.", "VIII");
		return BallFetch;
	}

	public static Pokemon_Ability_Constructor Battery()
	{
		Pokemon_Ability_Constructor Battery = new Pokemon_Ability_Constructor("Battery", "Powers up ally pokemon's special moves.", "VII");
		return Battery;
	}

	public static Pokemon_Ability_Constructor BattleArmor()
	{
		Pokemon_Ability_Constructor BattleArmor = new Pokemon_Ability_Constructor("Battle Armor", "Hard armor protects the pokemon from critical hits.", "III");
		return BattleArmor;
	}

	public static Pokemon_Ability_Constructor BattleBond()
	{
		Pokemon_Ability_Constructor BattleBond = new Pokemon_Ability_Constructor("Battle Bond", "Defeating an opposing pokemon strengthens the pokemon's bond with its Trainer, and it becomes Ash-Greninja. Water Shuriken gets more powerful.", "VII");
		return BattleBond;
	}

	public static Pokemon_Ability_Constructor BeastBoost()
	{
		Pokemon_Ability_Constructor BeastBoost = new Pokemon_Ability_Constructor("Beast Boost", "The pokemon boosts its most proficient stat each time it knocks out a pokemon.", "VII");
		return BeastBoost;
	}

	public static Pokemon_Ability_Constructor Berserk()
	{
		Pokemon_Ability_Constructor Berserk = new Pokemon_Ability_Constructor("Berserk", "Boosts the pokemon's Sp. Atk stat when it takes a hit that causes its hp to become half or less.", "VII");
		return Berserk;
	}

	public static Pokemon_Ability_Constructor BigPecks()
	{
		Pokemon_Ability_Constructor BigPecks = new Pokemon_Ability_Constructor("Big Pecks", "Protects the pokemon from Defense-lowering effects.", "V");
		return BigPecks;
	}

	public static Pokemon_Ability_Constructor Blaze()
	{
		Pokemon_Ability_Constructor Blaze = new Pokemon_Ability_Constructor("Blaze", "Powers up fire-type moves when the pokemon's hp is low.", "III");
		return Blaze;
	}

	public static Pokemon_Ability_Constructor Bulletproof()
	{
		Pokemon_Ability_Constructor Bulletproof = new Pokemon_Ability_Constructor("Bulletproof", "Protects the pokemon from some ball and bomb moves.", "VI");
		return Bulletproof;
	}

	public static Pokemon_Ability_Constructor Cacophony()
	{
		Pokemon_Ability_Constructor Cacophony = new Pokemon_Ability_Constructor("Cacophony", "Avoids sound-based moves.", "III");
		return Cacophony;
	}

	public static Pokemon_Ability_Constructor CheekPouch()
	{
		Pokemon_Ability_Constructor CheekPouch = new Pokemon_Ability_Constructor("Cheek Pouch", "Restores hp as well when the pokemon eats a berry.", "VI");
		return CheekPouch;
	}

	public static Pokemon_Ability_Constructor Chlorophyll()
	{
		Pokemon_Ability_Constructor Chlorophyll = new Pokemon_Ability_Constructor("Chlorophyll", "Boosts the pokemon's Speed stat in harsh sunlight.", "III");
		return Chlorophyll;
	}

	public static Pokemon_Ability_Constructor ClearBody()
	{
		Pokemon_Ability_Constructor ClearBody = new Pokemon_Ability_Constructor("Clear Body", "Prevents other pokemon's moves or Abilities from lowering the pokemon's stats.", "III");
		return ClearBody;
	}

	public static Pokemon_Ability_Constructor CloudNine()
	{
		Pokemon_Ability_Constructor CloudNine = new Pokemon_Ability_Constructor("Cloud Nine", "Eliminates the effects of weather.", "III");
		return CloudNine;
	}

	public static Pokemon_Ability_Constructor ColorChange()
	{
		Pokemon_Ability_Constructor ColorChange = new Pokemon_Ability_Constructor("Color Change", "The pokemon's type becomes the type of the move used on it.", "III");
		return ColorChange;
	}

	public static Pokemon_Ability_Constructor Comatose()
	{
		Pokemon_Ability_Constructor Comatose = new Pokemon_Ability_Constructor("Comatose", "It's always drowsing and will never wake up. It can attack without waking up.", "VII");
		return Comatose;
	}

	public static Pokemon_Ability_Constructor Competitive()
	{
		Pokemon_Ability_Constructor Competitive = new Pokemon_Ability_Constructor("Competitive", "Boosts the Sp. Atk stat sharply when a stat is lowered.", "VI");
		return Competitive;
	}

	public static Pokemon_Ability_Constructor CompoundEyes()
	{
		Pokemon_Ability_Constructor CompoundEyes = new Pokemon_Ability_Constructor("Compound Eyes", "The pokemon's compound eyes boost its accuracy.", "III");
		return CompoundEyes;
	}

	public static Pokemon_Ability_Constructor Contrary()
	{
		Pokemon_Ability_Constructor Contrary = new Pokemon_Ability_Constructor("Contrary", "Makes stat changes have an opposite effect.", "V");
		return Contrary;
	}

	public static Pokemon_Ability_Constructor Corrosion()
	{
		Pokemon_Ability_Constructor Corrosion = new Pokemon_Ability_Constructor("Corrosion", "The pokemon can poison the target even if it's a Steel or Poison type.", "VII");
		return Corrosion;
	}

	public static Pokemon_Ability_Constructor CottonDown()
	{
		Pokemon_Ability_Constructor CottonDown = new Pokemon_Ability_Constructor("Cotton Down", "When the pokemon is hit by an attack, it scatters cotton fluff around and lowers the Speed stat of all pokemon except itself.", "VIII");
		return CottonDown;
	}

	public static Pokemon_Ability_Constructor CursedBody()
	{
		Pokemon_Ability_Constructor CursedBody = new Pokemon_Ability_Constructor("Cursed Body", "May disable a move used on the pokemon.", "V");
		return CursedBody;
	}

	public static Pokemon_Ability_Constructor CuteCharm()
	{
		Pokemon_Ability_Constructor CuteCharm = new Pokemon_Ability_Constructor("Cute Charm", "Contact with the pokemon may cause infatuation.", "III");
		return CuteCharm;
	}

	public static Pokemon_Ability_Constructor Damp()
	{
		Pokemon_Ability_Constructor Damp = new Pokemon_Ability_Constructor("Damp", "Prevents the use of explosive moves, such as Self-Destruct, by dampening its surroundings.", "III");
		return Damp;
	}

	public static Pokemon_Ability_Constructor Dancer()
	{
		Pokemon_Ability_Constructor Dancer = new Pokemon_Ability_Constructor("Dancer", "When another pokemon uses a dance move, it can use a dance move following it regardless of its Speed.", "VII");
		return Dancer;
	}

	public static Pokemon_Ability_Constructor DarkAura()
	{
		Pokemon_Ability_Constructor DarkAura = new Pokemon_Ability_Constructor("Dark Aura", "Powers up each pokemon's dark-type moves.", "VI");
		return DarkAura;
	}

	public static Pokemon_Ability_Constructor DauntlessShield()
	{
		Pokemon_Ability_Constructor DauntlessShield = new Pokemon_Ability_Constructor("Dauntless Shield", "Boosts the pokemon's Defense stat when the pokemon enters a battle.", "VIII");
		return DauntlessShield;
	}

	public static Pokemon_Ability_Constructor Dazzling()
	{
		Pokemon_Ability_Constructor Dazzling = new Pokemon_Ability_Constructor("Dazzling", "Surprises the opposing pokemon, making it unable to attack using priority moves.", "VII");
		return Dazzling;
	}

	public static Pokemon_Ability_Constructor Defeatist()
	{
		Pokemon_Ability_Constructor Defeatist = new Pokemon_Ability_Constructor("Defeatist", "Halves the pokemon's Attack and Sp. Atk stats when its hp becomes half or less.", "V");
		return Defeatist;
	}

	public static Pokemon_Ability_Constructor Defiant()
	{
		Pokemon_Ability_Constructor Defiant = new Pokemon_Ability_Constructor("Defiant", "Boosts the pokemon's Attack stat sharply when its stats are lowered.", "V");
		return Defiant;
	}

	public static Pokemon_Ability_Constructor DeltaStream()
	{
		Pokemon_Ability_Constructor DeltaStream = new Pokemon_Ability_Constructor("Delta Stream", "The pokemon changes the weather to eliminate all of the Flying type's weaknesses.", "VI");
		return DeltaStream;
	}

	public static Pokemon_Ability_Constructor DesolateLand()
	{
		Pokemon_Ability_Constructor DesolateLand = new Pokemon_Ability_Constructor("Desolate Land", "The pokemon changes the weather to nullify water-type attacks.", "VI");
		return DesolateLand;
	}

	public static Pokemon_Ability_Constructor Disguise()
	{
		Pokemon_Ability_Constructor Disguise = new Pokemon_Ability_Constructor("Disguise", "Once per battle, the shroud that covers the pokemon can protect it from an attack.", "VII");
		return Disguise;
	}

	public static Pokemon_Ability_Constructor Download()
	{
		Pokemon_Ability_Constructor Download = new Pokemon_Ability_Constructor("Download", "Compares an opposing pokemon's Defense and Sp. Def stats before raising its own Attack or Sp. Atk stata", "€”whichever will be more effective.");
		return Download;
	}

	public static Pokemon_Ability_Constructor Drizzle()
	{
		Pokemon_Ability_Constructor Drizzle = new Pokemon_Ability_Constructor("Drizzle", "The pokemon makes it rain when it enters a battle.", "III");
		return Drizzle;
	}

	public static Pokemon_Ability_Constructor Drought()
	{
		Pokemon_Ability_Constructor Drought = new Pokemon_Ability_Constructor("Drought", "Turns the sunlight harsh when the pokemon enters a battle.", "III");
		return Drought;
	}

	public static Pokemon_Ability_Constructor DrySkin()
	{
		Pokemon_Ability_Constructor DrySkin = new Pokemon_Ability_Constructor("Dry Skin", "Restores hp in rain or when hit by water-type moves. Reduces hp in harsh sunlight, and increases the damage received from fire-type moves.", "IV");
		return DrySkin;
	}

	public static Pokemon_Ability_Constructor EarlyBird()
	{
		Pokemon_Ability_Constructor EarlyBird = new Pokemon_Ability_Constructor("Early Bird", "The pokemon awakens from sleep twice as fast as other pokemon.", "III");
		return EarlyBird;
	}

	public static Pokemon_Ability_Constructor EffectSpore()
	{
		Pokemon_Ability_Constructor EffectSpore = new Pokemon_Ability_Constructor("Effect Spore", "Contact with the pokemon may inflict poison, sleep, or paralysis on its attacker.", "III");
		return EffectSpore;
	}

	public static Pokemon_Ability_Constructor ElectricSurge()
	{
		Pokemon_Ability_Constructor ElectricSurge = new Pokemon_Ability_Constructor("Electric Surge", "Turns the ground into Electric Terrain when the pokemon enters a battle.", "VII");
		return ElectricSurge;
	}

	public static Pokemon_Ability_Constructor EmergencyExit()
	{
		Pokemon_Ability_Constructor EmergencyExit = new Pokemon_Ability_Constructor("Emergency Exit", "The pokemon, sensing danger, switches out when its hp becomes half or less.", "VII");
		return EmergencyExit;
	}

	public static Pokemon_Ability_Constructor FairyAura()
	{
		Pokemon_Ability_Constructor FairyAura = new Pokemon_Ability_Constructor("Fairy Aura", "Powers up each pokemon's fairy-type moves.", "VI");
		return FairyAura;
	}

	public static Pokemon_Ability_Constructor Filter()
	{
		Pokemon_Ability_Constructor Filter = new Pokemon_Ability_Constructor("Filter", "Reduces the power of supereffective attacks taken.", "IV");
		return Filter;
	}

	public static Pokemon_Ability_Constructor FlameBody()
	{
		Pokemon_Ability_Constructor FlameBody = new Pokemon_Ability_Constructor("Flame Body", "Contact with the pokemon may burn the attacker.", "III");
		return FlameBody;
	}

	public static Pokemon_Ability_Constructor FlareBoost()
	{
		Pokemon_Ability_Constructor FlareBoost = new Pokemon_Ability_Constructor("Flare Boost", "Powers up special attacks when the pokemon is burned.", "V");
		return FlareBoost;
	}

	public static Pokemon_Ability_Constructor FlashFire()
	{
		Pokemon_Ability_Constructor FlashFire = new Pokemon_Ability_Constructor("Flash Fire", "Powers up the pokemon's fire-type moves if it's hit by one.", "III");
		return FlashFire;
	}

	public static Pokemon_Ability_Constructor FlowerGift()
	{
		Pokemon_Ability_Constructor FlowerGift = new Pokemon_Ability_Constructor("Flower Gift", "Boosts the Attack and Sp. Def stats of itself and allies in harsh sunlight.", "IV");
		return FlowerGift;
	}

	public static Pokemon_Ability_Constructor FlowerVeil()
	{
		Pokemon_Ability_Constructor FlowerVeil = new Pokemon_Ability_Constructor("Flower Veil", "Ally grass-type pokemon are protected from status conditions and the lowering of their stats.", "VI");
		return FlowerVeil;
	}

	public static Pokemon_Ability_Constructor Fluffy()
	{
		Pokemon_Ability_Constructor Fluffy = new Pokemon_Ability_Constructor("Fluffy", "Halves the damage taken from moves that make direct contact, but doubles that of fire-type moves.", "VII");
		return Fluffy;
	}

	public static Pokemon_Ability_Constructor Forecast()
	{
		Pokemon_Ability_Constructor Forecast = new Pokemon_Ability_Constructor("Forecast", "The pokemon transforms with the weather to change its type to Water, Fire, or Ice.", "III");
		return Forecast;
	}

	public static Pokemon_Ability_Constructor Forewarn()
	{
		Pokemon_Ability_Constructor Forewarn = new Pokemon_Ability_Constructor("Forewarn", "When it enters a battle, the pokemon can tell one of the moves an opposing pokemon has.", "IV");
		return Forewarn;
	}

	public static Pokemon_Ability_Constructor FriendGuard()
	{
		Pokemon_Ability_Constructor FriendGuard = new Pokemon_Ability_Constructor("Friend Guard", "Reduces damage done to allies.", "V");
		return FriendGuard;
	}

	public static Pokemon_Ability_Constructor Frisk()
	{
		Pokemon_Ability_Constructor Frisk = new Pokemon_Ability_Constructor("Frisk", "When it enters a battle, the pokemon can check an opposing pokemon's held item.", "IV");
		return Frisk;
	}

	public static Pokemon_Ability_Constructor FullMetalBody()
	{
		Pokemon_Ability_Constructor FullMetalBody = new Pokemon_Ability_Constructor("Full Metal Body", "Prevents other pokemon's moves or Abilities from lowering the pokemon's stats.", "VII");
		return FullMetalBody;
	}

	public static Pokemon_Ability_Constructor FurCoat()
	{
		Pokemon_Ability_Constructor FurCoat = new Pokemon_Ability_Constructor("Fur Coat", "Halves the damage from physical moves.", "VI");
		return FurCoat;
	}

	public static Pokemon_Ability_Constructor GaleWings()
	{
		Pokemon_Ability_Constructor GaleWings = new Pokemon_Ability_Constructor("Gale Wings", "Gives priority to flying-type moves when the pokemon's hp is full.", "VI");
		return GaleWings;
	}

	public static Pokemon_Ability_Constructor Galvanize()
	{
		Pokemon_Ability_Constructor Galvanize = new Pokemon_Ability_Constructor("Galvanize", "normal-type moves become electric-type moves. The power of those moves is boosted a little.", "VII");
		return Galvanize;
	}

	public static Pokemon_Ability_Constructor Gluttony()
	{
		Pokemon_Ability_Constructor Gluttony = new Pokemon_Ability_Constructor("Gluttony", "Makes the pokemon eat a held berry when its hp drops to half or less, which is sooner than usual.", "IV");
		return Gluttony;
	}

	public static Pokemon_Ability_Constructor Gooey()
	{
		Pokemon_Ability_Constructor Gooey = new Pokemon_Ability_Constructor("Gooey", "Contact with the pokemon lowers the attacker's Speed stat.", "VI");
		return Gooey;
	}

	public static Pokemon_Ability_Constructor GorillaTactics()
	{
		Pokemon_Ability_Constructor GorillaTactics = new Pokemon_Ability_Constructor("Gorilla Tactics", "Boosts the pokemon's Attack stat but only allows the use of the first selected move.", "VIII");
		return GorillaTactics;
	}

	public static Pokemon_Ability_Constructor GrassPelt()
	{
		Pokemon_Ability_Constructor GrassPelt = new Pokemon_Ability_Constructor("Grass Pelt", "Boosts the pokemon's Defense stat on Grassy Terrain.", "VI");
		return GrassPelt;
	}

	public static Pokemon_Ability_Constructor GrassySurge()
	{
		Pokemon_Ability_Constructor GrassySurge = new Pokemon_Ability_Constructor("Grassy Surge", "Turns the ground into Grassy Terrain when the pokemon enters a battle.", "VII");
		return GrassySurge;
	}

	public static Pokemon_Ability_Constructor GulpMissile()
	{
		Pokemon_Ability_Constructor GulpMissile = new Pokemon_Ability_Constructor("Gulp Missile", "When the pokemon uses Surf or Dive, it will come back with prey. When it takes damage, it will spit out the prey to attack.", "VIII");
		return GulpMissile;
	}

	public static Pokemon_Ability_Constructor Guts()
	{
		Pokemon_Ability_Constructor Guts = new Pokemon_Ability_Constructor("Guts", "It's so gutsy that having a status condition boosts the pokemon's Attack stat.", "III");
		return Guts;
	}

	public static Pokemon_Ability_Constructor Harvest()
	{
		Pokemon_Ability_Constructor Harvest = new Pokemon_Ability_Constructor("Harvest", "May create another berry after one is used.", "V");
		return Harvest;
	}

	public static Pokemon_Ability_Constructor Healer()
	{
		Pokemon_Ability_Constructor Healer = new Pokemon_Ability_Constructor("Healer", "Sometimes heals an ally's status condition.", "V");
		return Healer;
	}

	public static Pokemon_Ability_Constructor Heatproof()
	{
		Pokemon_Ability_Constructor Heatproof = new Pokemon_Ability_Constructor("Heatproof", "The heatproof body of the pokemon halves the damage from fire-type moves that hit it.", "IV");
		return Heatproof;
	}

	public static Pokemon_Ability_Constructor HeavyMetal()
	{
		Pokemon_Ability_Constructor HeavyMetal = new Pokemon_Ability_Constructor("Heavy Metal", "Doubles the pokemon's weight.", "V");
		return HeavyMetal;
	}

	public static Pokemon_Ability_Constructor HoneyGather()
	{
		Pokemon_Ability_Constructor HoneyGather = new Pokemon_Ability_Constructor("Honey Gather", "The pokemon may gather Honey after a battle.", "IV");
		return HoneyGather;
	}

	public static Pokemon_Ability_Constructor HugePower()
	{
		Pokemon_Ability_Constructor HugePower = new Pokemon_Ability_Constructor("Huge Power", "Doubles the pokemon's Attack stat.", "III");
		return HugePower;
	}

	public static Pokemon_Ability_Constructor HungerSwitch()
	{
		Pokemon_Ability_Constructor HungerSwitch = new Pokemon_Ability_Constructor("Hunger Switch", "The pokemon changes its form, alternating between its Full Belly Mode and Hangry Mode after the end of each turn.", "VIII");
		return HungerSwitch;
	}

	public static Pokemon_Ability_Constructor Hustle()
	{
		Pokemon_Ability_Constructor Hustle = new Pokemon_Ability_Constructor("Hustle", "Boosts the Attack stat, but lowers accuracy.", "III");
		return Hustle;
	}

	public static Pokemon_Ability_Constructor Hydration()
	{
		Pokemon_Ability_Constructor Hydration = new Pokemon_Ability_Constructor("Hydration", "Heals status conditions if it's raining.", "IV");
		return Hydration;
	}

	public static Pokemon_Ability_Constructor HyperCutter()
	{
		Pokemon_Ability_Constructor HyperCutter = new Pokemon_Ability_Constructor("Hyper Cutter", "The pokemon's proud of its powerful pincers. They prevent other pokemon from lowering its Attack stat.", "III");
		return HyperCutter;
	}

	public static Pokemon_Ability_Constructor IceBody()
	{
		Pokemon_Ability_Constructor IceBody = new Pokemon_Ability_Constructor("Ice Body", "The pokemon gradually regains hp in a hailstorm.", "IV");
		return IceBody;
	}

	public static Pokemon_Ability_Constructor IceFace()
	{
		Pokemon_Ability_Constructor IceFace = new Pokemon_Ability_Constructor("Ice Face", "The pokemon's ice head can take a physical attack as a substitute, but the attack also changes the pokemon's appearance. The ice will be restored when it hails.", "VIII");
		return IceFace;
	}

	public static Pokemon_Ability_Constructor IceScales()
	{
		Pokemon_Ability_Constructor IceScales = new Pokemon_Ability_Constructor("Ice Scales", "The pokemon is protected by ice scales, which halve the damage taken from special moves.", "VIII");
		return IceScales;
	}

	public static Pokemon_Ability_Constructor Illuminate()
	{
		Pokemon_Ability_Constructor Illuminate = new Pokemon_Ability_Constructor("Illuminate", "Raises the likelihood of meeting wild pokemon by illuminating the surroundings.", "III");
		return Illuminate;
	}

	public static Pokemon_Ability_Constructor Illusion()
	{
		Pokemon_Ability_Constructor Illusion = new Pokemon_Ability_Constructor("Illusion", "Comes out disguised as the pokemon in the party's last spot.", "V");
		return Illusion;
	}

	public static Pokemon_Ability_Constructor Immunity()
	{
		Pokemon_Ability_Constructor Immunity = new Pokemon_Ability_Constructor("Immunity", "The immune system of the pokemon prevents it from getting poisoned.", "III");
		return Immunity;
	}

	public static Pokemon_Ability_Constructor Imposter()
	{
		Pokemon_Ability_Constructor Imposter = new Pokemon_Ability_Constructor("Imposter", "The pokemon transforms itself into the pokemon it's facing.", "V");
		return Imposter;
	}

	public static Pokemon_Ability_Constructor Infiltrator()
	{
		Pokemon_Ability_Constructor Infiltrator = new Pokemon_Ability_Constructor("Infiltrator", "Passes through the opposing pokemon's barrier, substitute, and the like and strikes.", "V");
		return Infiltrator;
	}

	public static Pokemon_Ability_Constructor InnardsOut()
	{
		Pokemon_Ability_Constructor InnardsOut = new Pokemon_Ability_Constructor("Innards Out", "Damages the attacker landing the finishing hit by the amount equal to its last hp.", "VII");
		return InnardsOut;
	}

	public static Pokemon_Ability_Constructor InnerFocus()
	{
		Pokemon_Ability_Constructor InnerFocus = new Pokemon_Ability_Constructor("Inner Focus", "The pokemon's intensely focused, and that protects the pokemon from flinching.", "III");
		return InnerFocus;
	}

	public static Pokemon_Ability_Constructor Insomnia()
	{
		Pokemon_Ability_Constructor Insomnia = new Pokemon_Ability_Constructor("Insomnia", "The pokemon is suffering from insomnia and cannot fall asleep.", "III");
		return Insomnia;
	}

	public static Pokemon_Ability_Constructor Intimidate()
	{
		Pokemon_Ability_Constructor Intimidate = new Pokemon_Ability_Constructor("Intimidate", "The pokemon intimidates opposing pokemon upon entering battle, lowering their Attack stat.", "III");
		return Intimidate;
	}

	public static Pokemon_Ability_Constructor IntrepidSword()
	{
		Pokemon_Ability_Constructor IntrepidSword = new Pokemon_Ability_Constructor("Intrepid Sword", "Boosts the pokemon's Attack stat when the pokemon enters a battle.", "VIII");
		return IntrepidSword;
	}

	public static Pokemon_Ability_Constructor IronBarbs()
	{
		Pokemon_Ability_Constructor IronBarbs = new Pokemon_Ability_Constructor("Iron Barbs", "Inflicts damage on the attacker upon contact with iron barbs.", "V");
		return IronBarbs;
	}

	public static Pokemon_Ability_Constructor IronFist()
	{
		Pokemon_Ability_Constructor IronFist = new Pokemon_Ability_Constructor("Iron Fist", "Powers up punching moves.", "IV");
		return IronFist;
	}

	public static Pokemon_Ability_Constructor Justified()
	{
		Pokemon_Ability_Constructor Justified = new Pokemon_Ability_Constructor("Justified", "Being hit by a dark-type move boosts the Attack stat of the pokemon, for justice.", "V");
		return Justified;
	}

	public static Pokemon_Ability_Constructor KeenEye()
	{
		Pokemon_Ability_Constructor KeenEye = new Pokemon_Ability_Constructor("Keen Eye", "Keen eyes prevent other pokemon from lowering this pokemon's accuracy.", "III");
		return KeenEye;
	}

	public static Pokemon_Ability_Constructor Klutz()
	{
		Pokemon_Ability_Constructor Klutz = new Pokemon_Ability_Constructor("Klutz", "The pokemon can't use any held items.", "IV");
		return Klutz;
	}

	public static Pokemon_Ability_Constructor LeafGuard()
	{
		Pokemon_Ability_Constructor LeafGuard = new Pokemon_Ability_Constructor("Leaf Guard", "Prevents status conditions in harsh sunlight.", "IV");
		return LeafGuard;
	}

	public static Pokemon_Ability_Constructor Levitate()
	{
		Pokemon_Ability_Constructor Levitate = new Pokemon_Ability_Constructor("Levitate", "By floating in the air, the pokemon receives full immunity to all ground-type moves.", "III");
		return Levitate;
	}

	public static Pokemon_Ability_Constructor Libero()
	{
		Pokemon_Ability_Constructor Libero = new Pokemon_Ability_Constructor("Libero", "Changes the pokemon's type to the type of the move it's about to use.", "VIII");
		return Libero;
	}

	public static Pokemon_Ability_Constructor LightMetal()
	{
		Pokemon_Ability_Constructor LightMetal = new Pokemon_Ability_Constructor("Light Metal", "Halves the pokemon's weight.", "V");
		return LightMetal;
	}

	public static Pokemon_Ability_Constructor LightningRod()
	{
		Pokemon_Ability_Constructor LightningRod = new Pokemon_Ability_Constructor("Lightning Rod", "The pokemon draws in all electric-type moves. Instead of being hit by electric-type moves, it boosts its Sp. Atk.", "III");
		return LightningRod;
	}

	public static Pokemon_Ability_Constructor Limber()
	{
		Pokemon_Ability_Constructor Limber = new Pokemon_Ability_Constructor("Limber", "Its limber body protects the pokemon from paralysis.", "III");
		return Limber;
	}

	public static Pokemon_Ability_Constructor LiquidOoze()
	{
		Pokemon_Ability_Constructor LiquidOoze = new Pokemon_Ability_Constructor("Liquid Ooze", "The oozed liquid has a strong stench, which damages attackers using any draining move.", "III");
		return LiquidOoze;
	}

	public static Pokemon_Ability_Constructor LiquidVoice()
	{
		Pokemon_Ability_Constructor LiquidVoice = new Pokemon_Ability_Constructor("Liquid Voice", "All sound-based moves become water-type moves.", "VII");
		return LiquidVoice;
	}

	public static Pokemon_Ability_Constructor LongReach()
	{
		Pokemon_Ability_Constructor LongReach = new Pokemon_Ability_Constructor("Long Reach", "The pokemon uses its moves without making contact with the target.", "VII");
		return LongReach;
	}

	public static Pokemon_Ability_Constructor MagicBounce()
	{
		Pokemon_Ability_Constructor MagicBounce = new Pokemon_Ability_Constructor("Magic Bounce", "Reflects status moves instead of getting hit by them.", "V");
		return MagicBounce;
	}

	public static Pokemon_Ability_Constructor MagicGuard()
	{
		Pokemon_Ability_Constructor MagicGuard = new Pokemon_Ability_Constructor("Magic Guard", "The pokemon only takes damage from attacks.", "IV");
		return MagicGuard;
	}

	public static Pokemon_Ability_Constructor Magician()
	{
		Pokemon_Ability_Constructor Magician = new Pokemon_Ability_Constructor("Magician", "The pokemon steals the held item of a pokemon it hits with a move.", "VI");
		return Magician;
	}

	public static Pokemon_Ability_Constructor MagmaArmor()
	{
		Pokemon_Ability_Constructor MagmaArmor = new Pokemon_Ability_Constructor("Magma Armor", "The pokemon is covered with hot magma, which prevents the pokemon from becoming frozen.", "III");
		return MagmaArmor;
	}

	public static Pokemon_Ability_Constructor MagnetPull()
	{
		Pokemon_Ability_Constructor MagnetPull = new Pokemon_Ability_Constructor("Magnet Pull", "Prevents steel-type pokemon from escaping using its magnetic force.", "III");
		return MagnetPull;
	}

	public static Pokemon_Ability_Constructor MarvelScale()
	{
		Pokemon_Ability_Constructor MarvelScale = new Pokemon_Ability_Constructor("Marvel Scale", "The pokemon's marvelous scales boost the Defense stat if it has a status condition.", "III");
		return MarvelScale;
	}

	public static Pokemon_Ability_Constructor MegaLauncher()
	{
		Pokemon_Ability_Constructor MegaLauncher = new Pokemon_Ability_Constructor("Mega Launcher", "Powers up aura and pulse moves.", "VI");
		return MegaLauncher;
	}

	public static Pokemon_Ability_Constructor Merciless()
	{
		Pokemon_Ability_Constructor Merciless = new Pokemon_Ability_Constructor("Merciless", "The pokemon's attacks become critical hits if the target is poisoned.", "VII");
		return Merciless;
	}

	public static Pokemon_Ability_Constructor Mimicry()
	{
		Pokemon_Ability_Constructor Mimicry = new Pokemon_Ability_Constructor("Mimicry", "Changes the pokemon's type depending on the terrain.", "VIII");
		return Mimicry;
	}

	public static Pokemon_Ability_Constructor Minus()
	{
		Pokemon_Ability_Constructor Minus = new Pokemon_Ability_Constructor("Minus", "Boosts the Sp. Atk stat of the pokemon if an ally with the Plus or Minus Ability is also in battle.", "III");
		return Minus;
	}

	public static Pokemon_Ability_Constructor MirrorArmor()
	{
		Pokemon_Ability_Constructor MirrorArmor = new Pokemon_Ability_Constructor("Mirror Armor", "Bounces back only the stat-lowering effects that the pokemon receives.", "VIII");
		return MirrorArmor;
	}

	public static Pokemon_Ability_Constructor MistySurge()
	{
		Pokemon_Ability_Constructor MistySurge = new Pokemon_Ability_Constructor("Misty Surge", "Turns the ground into Misty Terrain when the pokemon enters a battle.", "VII");
		return MistySurge;
	}

	public static Pokemon_Ability_Constructor MoldBreaker()
	{
		Pokemon_Ability_Constructor MoldBreaker = new Pokemon_Ability_Constructor("Mold Breaker", "Moves can be used on the target regardless of its Abilities.", "IV");
		return MoldBreaker;
	}

	public static Pokemon_Ability_Constructor Moody()
	{
		Pokemon_Ability_Constructor Moody = new Pokemon_Ability_Constructor("Moody", "Raises one stat sharply and lowers another every turn.", "V");
		return Moody;
	}

	public static Pokemon_Ability_Constructor MotorDrive()
	{
		Pokemon_Ability_Constructor MotorDrive = new Pokemon_Ability_Constructor("Motor Drive", "Boosts its Speed stat if hit by an electric-type move instead of taking damage.", "IV");
		return MotorDrive;
	}

	public static Pokemon_Ability_Constructor Moxie()
	{
		Pokemon_Ability_Constructor Moxie = new Pokemon_Ability_Constructor("Moxie", "The pokemon shows moxie, and that boosts the Attack stat after knocking out any pokemon.", "V");
		return Moxie;
	}

	public static Pokemon_Ability_Constructor Multiscale()
	{
		Pokemon_Ability_Constructor Multiscale = new Pokemon_Ability_Constructor("Multiscale", "Reduces the amount of damage the pokemon takes while its hp is full.", "V");
		return Multiscale;
	}

	public static Pokemon_Ability_Constructor Multitype()
	{
		Pokemon_Ability_Constructor Multitype = new Pokemon_Ability_Constructor("Multitype", "Changes the pokemon's type to match the Plate or Z-Crystal it holds.", "IV");
		return Multitype;
	}

	public static Pokemon_Ability_Constructor Mummy()
	{
		Pokemon_Ability_Constructor Mummy = new Pokemon_Ability_Constructor("Mummy", "Contact with the pokemon changes the attacker's Ability to Mummy.", "V");
		return Mummy;
	}

	public static Pokemon_Ability_Constructor NaturalCure()
	{
		Pokemon_Ability_Constructor NaturalCure = new Pokemon_Ability_Constructor("Natural Cure", "All status conditions heal when the pokemon switches out.", "III");
		return NaturalCure;
	}

	public static Pokemon_Ability_Constructor Neuroforce()
	{
		Pokemon_Ability_Constructor Neuroforce = new Pokemon_Ability_Constructor("Neuroforce", "Powers up moves that are super effective.", "VII");
		return Neuroforce;
	}

	public static Pokemon_Ability_Constructor NeutralizingGas()
	{
		Pokemon_Ability_Constructor NeutralizingGas = new Pokemon_Ability_Constructor("Neutralizing Gas", "If the pokemon with Neutralizing Gas is in the battle, the effects of all pokemon's Abilities will be nullified or will not be triggered.", "VIII");
		return NeutralizingGas;
	}

	public static Pokemon_Ability_Constructor NoGuard()
	{
		Pokemon_Ability_Constructor NoGuard = new Pokemon_Ability_Constructor("No Guard", "The pokemon employs no-guard tactics to ensure incoming and outgoing attacks always land.", "IV");
		return NoGuard;
	}

	public static Pokemon_Ability_Constructor Normalize()
	{
		Pokemon_Ability_Constructor Normalize = new Pokemon_Ability_Constructor("Normalize", "All the pokemon's moves become Normal type. The power of those moves is boosted a little.", "IV");
		return Normalize;
	}

	public static Pokemon_Ability_Constructor Oblivious()
	{
		Pokemon_Ability_Constructor Oblivious = new Pokemon_Ability_Constructor("Oblivious", "The pokemon is oblivious, and that keeps it from being infatuated or falling for taunts.", "III");
		return Oblivious;
	}

	public static Pokemon_Ability_Constructor Overcoat()
	{
		Pokemon_Ability_Constructor Overcoat = new Pokemon_Ability_Constructor("Overcoat", "Protects the pokemon from things like sand, hail, and powder.", "V");
		return Overcoat;
	}

	public static Pokemon_Ability_Constructor Overgrow()
	{
		Pokemon_Ability_Constructor Overgrow = new Pokemon_Ability_Constructor("Overgrow", "Powers up grass-type moves when the pokemon's hp is low.", "III");
		return Overgrow;
	}

	public static Pokemon_Ability_Constructor OwnTempo()
	{
		Pokemon_Ability_Constructor OwnTempo = new Pokemon_Ability_Constructor("Own Tempo", "This pokemon has its own tempo, and that prevents it from becoming confused.", "III");
		return OwnTempo;
	}

	public static Pokemon_Ability_Constructor ParentalBond()
	{
		Pokemon_Ability_Constructor ParentalBond = new Pokemon_Ability_Constructor("Parental Bond", "Parent and child each attacks.", "VI");
		return ParentalBond;
	}

	public static Pokemon_Ability_Constructor PastelVeil()
	{
		Pokemon_Ability_Constructor PastelVeil = new Pokemon_Ability_Constructor("Pastel Veil", "Protects the pokemon and its ally pokemon from being poisoned.", "VIII");
		return PastelVeil;
	}

	public static Pokemon_Ability_Constructor PerishBody()
	{
		Pokemon_Ability_Constructor PerishBody = new Pokemon_Ability_Constructor("Perish Body", "When hit by a move that makes direct contact, the pokemon and the attacker will faint after three turns unless they switch out of battle.", "VIII");
		return PerishBody;
	}

	public static Pokemon_Ability_Constructor Pickpocket()
	{
		Pokemon_Ability_Constructor Pickpocket = new Pokemon_Ability_Constructor("Pickpocket", "Steals an item from an attacker that made direct contact.", "V");
		return Pickpocket;
	}

	public static Pokemon_Ability_Constructor Pickup()
	{
		Pokemon_Ability_Constructor Pickup = new Pokemon_Ability_Constructor("Pickup", "The pokemon may pick up the item an opposing pokemon used during a battle. It may pick up items outside of battle, too.", "III");
		return Pickup;
	}

	public static Pokemon_Ability_Constructor Pixilate()
	{
		Pokemon_Ability_Constructor Pixilate = new Pokemon_Ability_Constructor("Pixilate", "normal-type moves become fairy-type moves. The power of those moves is boosted a little.", "VI");
		return Pixilate;
	}

	public static Pokemon_Ability_Constructor Plus()
	{
		Pokemon_Ability_Constructor Plus = new Pokemon_Ability_Constructor("Plus", "Boosts the Sp. Atk stat of the pokemon if an ally with the Plus or Minus Ability is also in battle.", "III");
		return Plus;
	}

	public static Pokemon_Ability_Constructor PoisonHeal()
	{
		Pokemon_Ability_Constructor PoisonHeal = new Pokemon_Ability_Constructor("Poison Heal", "Restores hp if the pokemon is poisoned instead of losing hp.", "IV");
		return PoisonHeal;
	}

	public static Pokemon_Ability_Constructor PoisonPoint()
	{
		Pokemon_Ability_Constructor PoisonPoint = new Pokemon_Ability_Constructor("Poison Point", "Contact with the pokemon may poison the attacker.", "III");
		return PoisonPoint;
	}

	public static Pokemon_Ability_Constructor PoisonTouch()
	{
		Pokemon_Ability_Constructor PoisonTouch = new Pokemon_Ability_Constructor("Poison Touch", "May poison a target when the pokemon makes contact.", "V");
		return PoisonTouch;
	}

	public static Pokemon_Ability_Constructor PowerConstruct()
	{
		Pokemon_Ability_Constructor PowerConstruct = new Pokemon_Ability_Constructor("Power Construct", "Other cells gather to aid when its hp becomes half or less. Then the pokemon changes its form to Complete Forme.", "VII");
		return PowerConstruct;
	}

	public static Pokemon_Ability_Constructor PowerofAlchemy()
	{
		Pokemon_Ability_Constructor PowerofAlchemy = new Pokemon_Ability_Constructor("Power of Alchemy", "The pokemon copies the Ability of a defeated ally.", "VII");
		return PowerofAlchemy;
	}

	public static Pokemon_Ability_Constructor PowerSpot()
	{
		Pokemon_Ability_Constructor PowerSpot = new Pokemon_Ability_Constructor("Power Spot", "Just being next to the pokemon powers up moves.", "VIII");
		return PowerSpot;
	}

	public static Pokemon_Ability_Constructor Prankster()
	{
		Pokemon_Ability_Constructor Prankster = new Pokemon_Ability_Constructor("Prankster", "Gives priority to a status move.", "V");
		return Prankster;
	}

	public static Pokemon_Ability_Constructor Pressure()
	{
		Pokemon_Ability_Constructor Pressure = new Pokemon_Ability_Constructor("Pressure", "By putting pressure on the opposing pokemon, it raises their PP usage.", "III");
		return Pressure;
	}

	public static Pokemon_Ability_Constructor PrimordialSea()
	{
		Pokemon_Ability_Constructor PrimordialSea = new Pokemon_Ability_Constructor("Primordial Sea", "The pokemon changes the weather to nullify fire-type attacks.", "VI");
		return PrimordialSea;
	}

	public static Pokemon_Ability_Constructor PrismArmor()
	{
		Pokemon_Ability_Constructor PrismArmor = new Pokemon_Ability_Constructor("Prism Armor", "Reduces the power of supereffective attacks taken.", "VII");
		return PrismArmor;
	}

	public static Pokemon_Ability_Constructor PropellerTail()
	{
		Pokemon_Ability_Constructor PropellerTail = new Pokemon_Ability_Constructor("Propeller Tail", "Ignores the effects of opposing pokemon's Abilities and moves that draw in moves.", "VIII");
		return PropellerTail;
	}

	public static Pokemon_Ability_Constructor Protean()
	{
		Pokemon_Ability_Constructor Protean = new Pokemon_Ability_Constructor("Protean", "Changes the pokemon's type to the type of the move it's about to use.", "VI");
		return Protean;
	}

	public static Pokemon_Ability_Constructor PsychicSurge()
	{
		Pokemon_Ability_Constructor PsychicSurge = new Pokemon_Ability_Constructor("Psychic Surge", "Turns the ground into Psychic Terrain when the pokemon enters a battle.", "VII");
		return PsychicSurge;
	}

	public static Pokemon_Ability_Constructor PunkRock()
	{
		Pokemon_Ability_Constructor PunkRock = new Pokemon_Ability_Constructor("Punk Rock", "Boosts the power of sound-based moves. The pokemon also takes half the damage from these kinds of moves.", "VIII");
		return PunkRock;
	}

	public static Pokemon_Ability_Constructor PurePower()
	{
		Pokemon_Ability_Constructor PurePower = new Pokemon_Ability_Constructor("Pure Power", "Using its pure power, the pokemon doubles its Attack stat.", "III");
		return PurePower;
	}

	public static Pokemon_Ability_Constructor QueenlyMajesty()
	{
		Pokemon_Ability_Constructor QueenlyMajesty = new Pokemon_Ability_Constructor("Queenly Majesty", "Its majesty pressures the opposing pokemon, making it unable to attack using priority moves.", "VII");
		return QueenlyMajesty;
	}

	public static Pokemon_Ability_Constructor QuickFeet()
	{
		Pokemon_Ability_Constructor QuickFeet = new Pokemon_Ability_Constructor("Quick Feet", "Boosts the Speed stat if the pokemon has a status condition.", "IV");
		return QuickFeet;
	}

	public static Pokemon_Ability_Constructor RainDish()
	{
		Pokemon_Ability_Constructor RainDish = new Pokemon_Ability_Constructor("Rain Dish", "The pokemon gradually regains hp in rain.", "III");
		return RainDish;
	}

	public static Pokemon_Ability_Constructor Rattled()
	{
		Pokemon_Ability_Constructor Rattled = new Pokemon_Ability_Constructor("Rattled", "Dark-, Ghost-, and bug-type moves scare the pokemon and boost its Speed stat.", "V");
		return Rattled;
	}

	public static Pokemon_Ability_Constructor Receiver()
	{
		Pokemon_Ability_Constructor Receiver = new Pokemon_Ability_Constructor("Receiver", "The pokemon copies the Ability of a defeated ally.", "VII");
		return Receiver;
	}

	public static Pokemon_Ability_Constructor Reckless()
	{
		Pokemon_Ability_Constructor Reckless = new Pokemon_Ability_Constructor("Reckless", "Powers up moves that have recoil damage.", "IV");
		return Reckless;
	}

	public static Pokemon_Ability_Constructor Refrigerate()
	{
		Pokemon_Ability_Constructor Refrigerate = new Pokemon_Ability_Constructor("Refrigerate", "normal-type moves become ice-type moves. The power of those moves is boosted a little.", "VI");
		return Refrigerate;
	}

	public static Pokemon_Ability_Constructor Regenerator()
	{
		Pokemon_Ability_Constructor Regenerator = new Pokemon_Ability_Constructor("Regenerator", "Restores a little hp when withdrawn from battle.", "V");
		return Regenerator;
	}

	public static Pokemon_Ability_Constructor Ripen()
	{
		Pokemon_Ability_Constructor Ripen = new Pokemon_Ability_Constructor("Ripen", "Ripens berries and doubles their effect.", "VIII");
		return Ripen;
	}

	public static Pokemon_Ability_Constructor Rivalry()
	{
		Pokemon_Ability_Constructor Rivalry = new Pokemon_Ability_Constructor("Rivalry", "Becomes competitive and deals more damage to pokemon of the same gender, but deals less to pokemon of the opposite gender.", "IV");
		return Rivalry;
	}

	public static Pokemon_Ability_Constructor RKSSystem()
	{
		Pokemon_Ability_Constructor RKSSystem = new Pokemon_Ability_Constructor("RKS System", "Changes the pokemon's type to match the memory disc it holds.", "VII");
		return RKSSystem;
	}

	public static Pokemon_Ability_Constructor RockHead()
	{
		Pokemon_Ability_Constructor RockHead = new Pokemon_Ability_Constructor("Rock Head", "Protects the pokemon from recoil damage.", "III");
		return RockHead;
	}

	public static Pokemon_Ability_Constructor RoughSkin()
	{
		Pokemon_Ability_Constructor RoughSkin = new Pokemon_Ability_Constructor("Rough Skin", "This pokemon inflicts damage with its rough skin to the attacker on contact.", "III");
		return RoughSkin;
	}

	public static Pokemon_Ability_Constructor RunAway()
	{
		Pokemon_Ability_Constructor RunAway = new Pokemon_Ability_Constructor("Run Away", "Enables a sure getaway from wild pokemon.", "III");
		return RunAway;
	}

	public static Pokemon_Ability_Constructor SandForce()
	{
		Pokemon_Ability_Constructor SandForce = new Pokemon_Ability_Constructor("Sand Force", "Boosts the power of Rock-, Ground-, and steel-type moves in a sandstorm.", "V");
		return SandForce;
	}

	public static Pokemon_Ability_Constructor SandRush()
	{
		Pokemon_Ability_Constructor SandRush = new Pokemon_Ability_Constructor("Sand Rush", "Boosts the pokemon's Speed stat in a sandstorm.", "V");
		return SandRush;
	}

	public static Pokemon_Ability_Constructor SandSpit()
	{
		Pokemon_Ability_Constructor SandSpit = new Pokemon_Ability_Constructor("Sand Spit", "The pokemon creates a sandstorm when it's hit by an attack.", "VIII");
		return SandSpit;
	}

	public static Pokemon_Ability_Constructor SandStream()
	{
		Pokemon_Ability_Constructor SandStream = new Pokemon_Ability_Constructor("Sand Stream", "The pokemon summons a sandstorm when it enters a battle.", "III");
		return SandStream;
	}

	public static Pokemon_Ability_Constructor SandVeil()
	{
		Pokemon_Ability_Constructor SandVeil = new Pokemon_Ability_Constructor("Sand Veil", "Boosts the pokemon's evasiveness in a sandstorm.", "III");
		return SandVeil;
	}

	public static Pokemon_Ability_Constructor SapSipper()
	{
		Pokemon_Ability_Constructor SapSipper = new Pokemon_Ability_Constructor("Sap Sipper", "Boosts the Attack stat if hit by a grass-type move instead of taking damage.", "V");
		return SapSipper;
	}

	public static Pokemon_Ability_Constructor Schooling()
	{
		Pokemon_Ability_Constructor Schooling = new Pokemon_Ability_Constructor("Schooling", "When it has a lot of hp, the pokemon forms a powerful school. It stops schooling when its hp is low.", "VII");
		return Schooling;
	}

	public static Pokemon_Ability_Constructor Scrappy()
	{
		Pokemon_Ability_Constructor Scrappy = new Pokemon_Ability_Constructor("Scrappy", "The pokemon can hit ghost-type pokemon with Normal- and fighting-type moves.", "IV");
		return Scrappy;
	}

	public static Pokemon_Ability_Constructor ScreenCleaner()
	{
		Pokemon_Ability_Constructor ScreenCleaner = new Pokemon_Ability_Constructor("Screen Cleaner", "When the pokemon enters a battle, the effects of Light Screen, Reflect, and Aurora Veil are nullified for both opposing and ally pokemon.", "VIII");
		return ScreenCleaner;
	}

	public static Pokemon_Ability_Constructor SereneGrace()
	{
		Pokemon_Ability_Constructor SereneGrace = new Pokemon_Ability_Constructor("Serene Grace", "Boosts the likelihood of additional effects occurring when attacking.", "III");
		return SereneGrace;
	}

	public static Pokemon_Ability_Constructor ShadowShield()
	{
		Pokemon_Ability_Constructor ShadowShield = new Pokemon_Ability_Constructor("Shadow Shield", "Reduces the amount of damage the pokemon takes while its hp is full.", "VII");
		return ShadowShield;
	}

	public static Pokemon_Ability_Constructor ShadowTag()
	{
		Pokemon_Ability_Constructor ShadowTag = new Pokemon_Ability_Constructor("Shadow Tag", "This pokemon steps on the opposing pokemon's shadow to prevent it from escaping.", "III");
		return ShadowTag;
	}

	public static Pokemon_Ability_Constructor ShedSkin()
	{
		Pokemon_Ability_Constructor ShedSkin = new Pokemon_Ability_Constructor("Shed Skin", "The pokemon may heal its own status conditions by shedding its skin.", "III");
		return ShedSkin;
	}

	public static Pokemon_Ability_Constructor SheerForce()
	{
		Pokemon_Ability_Constructor SheerForce = new Pokemon_Ability_Constructor("Sheer Force", "Removes additional effects to increase the power of moves when attacking.", "V");
		return SheerForce;
	}

	public static Pokemon_Ability_Constructor ShellArmor()
	{
		Pokemon_Ability_Constructor ShellArmor = new Pokemon_Ability_Constructor("Shell Armor", "A hard shell protects the pokemon from critical hits.", "III");
		return ShellArmor;
	}

	public static Pokemon_Ability_Constructor ShieldDust()
	{
		Pokemon_Ability_Constructor ShieldDust = new Pokemon_Ability_Constructor("Shield Dust", "This pokemon's dust blocks the additional effects of attacks taken.", "III");
		return ShieldDust;
	}

	public static Pokemon_Ability_Constructor ShieldsDown()
	{
		Pokemon_Ability_Constructor ShieldsDown = new Pokemon_Ability_Constructor("Shields Down", "When its hp becomes half or less, the pokemon's shell breaks and it becomes aggressive.", "VII");
		return ShieldsDown;
	}

	public static Pokemon_Ability_Constructor Simple()
	{
		Pokemon_Ability_Constructor Simple = new Pokemon_Ability_Constructor("Simple", "The stat changes the pokemon receives are doubled.", "IV");
		return Simple;
	}

	public static Pokemon_Ability_Constructor SkillLink()
	{
		Pokemon_Ability_Constructor SkillLink = new Pokemon_Ability_Constructor("Skill Link", "Maximizes the number of times multistrike moves hit.", "IV");
		return SkillLink;
	}

	public static Pokemon_Ability_Constructor SlowStart()
	{
		Pokemon_Ability_Constructor SlowStart = new Pokemon_Ability_Constructor("Slow Start", "For five turns, the pokemon's Attack and Speed stats are halved.", "IV");
		return SlowStart;
	}

	public static Pokemon_Ability_Constructor SlushRush()
	{
		Pokemon_Ability_Constructor SlushRush = new Pokemon_Ability_Constructor("Slush Rush", "Boosts the pokemon's Speed stat in a hailstorm.", "VII");
		return SlushRush;
	}

	public static Pokemon_Ability_Constructor Sniper()
	{
		Pokemon_Ability_Constructor Sniper = new Pokemon_Ability_Constructor("Sniper", "Powers up moves if they become critical hits when attacking.", "IV");
		return Sniper;
	}

	public static Pokemon_Ability_Constructor SnowCloak()
	{
		Pokemon_Ability_Constructor SnowCloak = new Pokemon_Ability_Constructor("Snow Cloak", "Boosts evasiveness in a hailstorm.", "IV");
		return SnowCloak;
	}

	public static Pokemon_Ability_Constructor SnowWarning()
	{
		Pokemon_Ability_Constructor SnowWarning = new Pokemon_Ability_Constructor("Snow Warning", "The pokemon summons a hailstorm when it enters a battle.", "IV");
		return SnowWarning;
	}

	public static Pokemon_Ability_Constructor SolarPower()
	{
		Pokemon_Ability_Constructor SolarPower = new Pokemon_Ability_Constructor("Solar Power", "Boosts the Sp. Atk stat in harsh sunlight, but hp decreases every turn.", "IV");
		return SolarPower;
	}

	public static Pokemon_Ability_Constructor SolidRock()
	{
		Pokemon_Ability_Constructor SolidRock = new Pokemon_Ability_Constructor("Solid Rock", "Reduces the power of supereffective attacks taken.", "IV");
		return SolidRock;
	}

	public static Pokemon_Ability_Constructor SoulHeart()
	{
		Pokemon_Ability_Constructor SoulHeart = new Pokemon_Ability_Constructor("Soul-Heart", "Boosts its Sp. Atk stat every time a pokemon faints.", "VII");
		return SoulHeart;
	}

	public static Pokemon_Ability_Constructor Soundproof()
	{
		Pokemon_Ability_Constructor Soundproof = new Pokemon_Ability_Constructor("Soundproof", "Soundproofing gives the pokemon full immunity to all sound-based moves.", "III");
		return Soundproof;
	}

	public static Pokemon_Ability_Constructor SpeedBoost()
	{
		Pokemon_Ability_Constructor SpeedBoost = new Pokemon_Ability_Constructor("Speed Boost", "Its Speed stat is boosted every turn.", "III");
		return SpeedBoost;
	}

	public static Pokemon_Ability_Constructor Stakeout()
	{
		Pokemon_Ability_Constructor Stakeout = new Pokemon_Ability_Constructor("Stakeout", "Doubles the damage dealt to the target's replacement if the target switches out.", "VII");
		return Stakeout;
	}

	public static Pokemon_Ability_Constructor Stall()
	{
		Pokemon_Ability_Constructor Stall = new Pokemon_Ability_Constructor("Stall", "The pokemon moves after all other pokemon do.", "IV");
		return Stall;
	}

	public static Pokemon_Ability_Constructor Stalwart()
	{
		Pokemon_Ability_Constructor Stalwart = new Pokemon_Ability_Constructor("Stalwart", "Ignores the effects of opposing pokemon's Abilities and moves that draw in moves.", "VIII");
		return Stalwart;
	}

	public static Pokemon_Ability_Constructor Stamina()
	{
		Pokemon_Ability_Constructor Stamina = new Pokemon_Ability_Constructor("Stamina", "Boosts the Defense stat when hit by an attack.", "VII");
		return Stamina;
	}

	public static Pokemon_Ability_Constructor StanceChange()
	{
		Pokemon_Ability_Constructor StanceChange = new Pokemon_Ability_Constructor("Stance Change", "The pokemon changes its form to Blade Forme when it uses an attack move and changes to Shield Forme when it uses King's Shield.", "VI");
		return StanceChange;
	}

	public static Pokemon_Ability_Constructor Static()
	{
		Pokemon_Ability_Constructor Static = new Pokemon_Ability_Constructor("Static", "The pokemon is charged with static electricity, so contact with it may cause paralysis.", "III");
		return Static;
	}

	public static Pokemon_Ability_Constructor Steadfast()
	{
		Pokemon_Ability_Constructor Steadfast = new Pokemon_Ability_Constructor("Steadfast", "The pokemon's determination boosts the Speed stat each time the pokemon flinches.", "IV");
		return Steadfast;
	}

	public static Pokemon_Ability_Constructor SteamEngine()
	{
		Pokemon_Ability_Constructor SteamEngine = new Pokemon_Ability_Constructor("Steam Engine", "Boosts the pokemon's Speed stat drastically if hit by a Fire- or water-type move.", "VIII");
		return SteamEngine;
	}

	public static Pokemon_Ability_Constructor Steelworker()
	{
		Pokemon_Ability_Constructor Steelworker = new Pokemon_Ability_Constructor("Steelworker", "Powers up steel-type moves.", "VII");
		return Steelworker;
	}

	public static Pokemon_Ability_Constructor SteelySpirit()
	{
		Pokemon_Ability_Constructor SteelySpirit = new Pokemon_Ability_Constructor("Steely Spirit", "Powers up ally pokemon's steel-type moves.", "VIII");
		return SteelySpirit;
	}

	public static Pokemon_Ability_Constructor Stench()
	{
		Pokemon_Ability_Constructor Stench = new Pokemon_Ability_Constructor("Stench", "By releasing stench when attacking, this pokemon may cause the target to flinch.", "III");
		return Stench;
	}

	public static Pokemon_Ability_Constructor StickyHold()
	{
		Pokemon_Ability_Constructor StickyHold = new Pokemon_Ability_Constructor("Sticky Hold", "Items held by the pokemon are stuck fast and cannot be removed by other pokemon.", "III");
		return StickyHold;
	}

	public static Pokemon_Ability_Constructor StormDrain()
	{
		Pokemon_Ability_Constructor StormDrain = new Pokemon_Ability_Constructor("Storm Drain", "Draws in all water-type moves. Instead of being hit by water-type moves, it boosts its Sp. Atk.", "IV");
		return StormDrain;
	}

	public static Pokemon_Ability_Constructor StrongJaw()
	{
		Pokemon_Ability_Constructor StrongJaw = new Pokemon_Ability_Constructor("Strong Jaw", "The pokemon's strong jaw boosts the power of its biting moves.", "VI");
		return StrongJaw;
	}

	public static Pokemon_Ability_Constructor Sturdy()
	{
		Pokemon_Ability_Constructor Sturdy = new Pokemon_Ability_Constructor("Sturdy", "It cannot be knocked out with one hit. One-hit KO moves cannot knock it out, either.", "III");
		return Sturdy;
	}

	public static Pokemon_Ability_Constructor SuctionCups()
	{
		Pokemon_Ability_Constructor SuctionCups = new Pokemon_Ability_Constructor("Suction Cups", "This pokemon uses suction cups to stay in one spot to negate all moves and items that force switching out.", "III");
		return SuctionCups;
	}

	public static Pokemon_Ability_Constructor SuperLuck()
	{
		Pokemon_Ability_Constructor SuperLuck = new Pokemon_Ability_Constructor("Super Luck", "The pokemon is so lucky that the critical-hit ratios of its moves are boosted.", "IV");
		return SuperLuck;
	}

	public static Pokemon_Ability_Constructor SurgeSurfer()
	{
		Pokemon_Ability_Constructor SurgeSurfer = new Pokemon_Ability_Constructor("Surge Surfer", "Doubles the pokemon's Speed stat on Electric Terrain.", "VII");
		return SurgeSurfer;
	}

	public static Pokemon_Ability_Constructor Swarm()
	{
		Pokemon_Ability_Constructor Swarm = new Pokemon_Ability_Constructor("Swarm", "Powers up bug-type moves when the pokemon's hp is low.", "III");
		return Swarm;
	}

	public static Pokemon_Ability_Constructor SweetVeil()
	{
		Pokemon_Ability_Constructor SweetVeil = new Pokemon_Ability_Constructor("Sweet Veil", "Prevents itself and ally pokemon from falling asleep.", "VI");
		return SweetVeil;
	}

	public static Pokemon_Ability_Constructor SwiftSwim()
	{
		Pokemon_Ability_Constructor SwiftSwim = new Pokemon_Ability_Constructor("Swift Swim", "Boosts the pokemon's Speed stat in rain.", "III");
		return SwiftSwim;
	}

	public static Pokemon_Ability_Constructor Symbiosis()
	{
		Pokemon_Ability_Constructor Symbiosis = new Pokemon_Ability_Constructor("Symbiosis", "The pokemon passes its item to an ally that has used up an item.", "VI");
		return Symbiosis;
	}

	public static Pokemon_Ability_Constructor Synchronize()
	{
		Pokemon_Ability_Constructor Synchronize = new Pokemon_Ability_Constructor("Synchronize", "The attacker will receive the same status condition if it inflicts a burn, poison, or paralysis to the pokemon.", "III");
		return Synchronize;
	}

	public static Pokemon_Ability_Constructor TangledFeet()
	{
		Pokemon_Ability_Constructor TangledFeet = new Pokemon_Ability_Constructor("Tangled Feet", "Raises evasiveness if the pokemon is confused.", "IV");
		return TangledFeet;
	}

	public static Pokemon_Ability_Constructor TanglingHair()
	{
		Pokemon_Ability_Constructor TanglingHair = new Pokemon_Ability_Constructor("Tangling Hair", "Contact with the pokemon lowers the attacker's Speed stat.", "VII");
		return TanglingHair;
	}

	public static Pokemon_Ability_Constructor Technician()
	{
		Pokemon_Ability_Constructor Technician = new Pokemon_Ability_Constructor("Technician", "Powers up the pokemon's weaker moves.", "IV");
		return Technician;
	}

	public static Pokemon_Ability_Constructor Telepathy()
	{
		Pokemon_Ability_Constructor Telepathy = new Pokemon_Ability_Constructor("Telepathy", "Anticipates an ally's attack and dodges it.", "V");
		return Telepathy;
	}

	public static Pokemon_Ability_Constructor Teravolt()
	{
		Pokemon_Ability_Constructor Teravolt = new Pokemon_Ability_Constructor("Teravolt", "Moves can be used on the target regardless of its Abilities.", "V");
		return Teravolt;
	}

	public static Pokemon_Ability_Constructor ThickFat()
	{
		Pokemon_Ability_Constructor ThickFat = new Pokemon_Ability_Constructor("Thick Fat", "The pokemon is protected by a layer of thick fat, which halves the damage taken from Fire- and ice-type moves.", "III");
		return ThickFat;
	}

	public static Pokemon_Ability_Constructor TintedLens()
	{
		Pokemon_Ability_Constructor TintedLens = new Pokemon_Ability_Constructor("Tinted Lens", "The pokemon can use 'not very effective' moves to deal regular damage.", "IV");
		return TintedLens;
	}

	public static Pokemon_Ability_Constructor Torrent()
	{
		Pokemon_Ability_Constructor Torrent = new Pokemon_Ability_Constructor("Torrent", "Powers up water-type moves when the pokemon's hp is low.", "III");
		return Torrent;
	}

	public static Pokemon_Ability_Constructor ToughClaws()
	{
		Pokemon_Ability_Constructor ToughClaws = new Pokemon_Ability_Constructor("Tough Claws", "Powers up moves that make direct contact.", "VI");
		return ToughClaws;
	}

	public static Pokemon_Ability_Constructor ToxicBoost()
	{
		Pokemon_Ability_Constructor ToxicBoost = new Pokemon_Ability_Constructor("Toxic Boost", "Powers up physical attacks when the pokemon is poisoned.", "V");
		return ToxicBoost;
	}

	public static Pokemon_Ability_Constructor Trace()
	{
		Pokemon_Ability_Constructor Trace = new Pokemon_Ability_Constructor("Trace", "When it enters a battle, the pokemon copies an opposing pokemon's Ability.", "III");
		return Trace;
	}

	public static Pokemon_Ability_Constructor Triage()
	{
		Pokemon_Ability_Constructor Triage = new Pokemon_Ability_Constructor("Triage", "Gives priority to a healing move.", "VII");
		return Triage;
	}

	public static Pokemon_Ability_Constructor Truant()
	{
		Pokemon_Ability_Constructor Truant = new Pokemon_Ability_Constructor("Truant", "The pokemon can't use a move if it had used a move on the previous turn.", "III");
		return Truant;
	}

	public static Pokemon_Ability_Constructor Turboblaze()
	{
		Pokemon_Ability_Constructor Turboblaze = new Pokemon_Ability_Constructor("Turboblaze", "Moves can be used on the target regardless of its Abilities.", "V");
		return Turboblaze;
	}

	public static Pokemon_Ability_Constructor Unaware()
	{
		Pokemon_Ability_Constructor Unaware = new Pokemon_Ability_Constructor("Unaware", "When attacking, the pokemon ignores the target pokemon's stat changes.", "IV");
		return Unaware;
	}

	public static Pokemon_Ability_Constructor Unburden()
	{
		Pokemon_Ability_Constructor Unburden = new Pokemon_Ability_Constructor("Unburden", "Boosts the Speed stat if the pokemon's held item is used or lost.", "IV");
		return Unburden;
	}

	public static Pokemon_Ability_Constructor Unnerve()
	{
		Pokemon_Ability_Constructor Unnerve = new Pokemon_Ability_Constructor("Unnerve", "Unnerves opposing pokemon and makes them unable to eat berries.", "V");
		return Unnerve;
	}

	public static Pokemon_Ability_Constructor VictoryStar()
	{
		Pokemon_Ability_Constructor VictoryStar = new Pokemon_Ability_Constructor("Victory Star", "Boosts the accuracy of its allies and itself.", "V");
		return VictoryStar;
	}

	public static Pokemon_Ability_Constructor VitalSpirit()
	{
		Pokemon_Ability_Constructor VitalSpirit = new Pokemon_Ability_Constructor("Vital Spirit", "The pokemon is full of vitality, and that prevents it from falling asleep.", "III");
		return VitalSpirit;
	}

	public static Pokemon_Ability_Constructor VoltAbsorb()
	{
		Pokemon_Ability_Constructor VoltAbsorb = new Pokemon_Ability_Constructor("Volt Absorb", "Restores hp if hit by an electric-type move instead of taking damage.", "III");
		return VoltAbsorb;
	}

	public static Pokemon_Ability_Constructor WanderingSpirit()
	{
		Pokemon_Ability_Constructor WanderingSpirit = new Pokemon_Ability_Constructor("Wandering Spirit", "The pokemon exchanges Abilities with a pokemon that hits it with a move that makes direct contact.", "VIII");
		return WanderingSpirit;
	}

	public static Pokemon_Ability_Constructor WaterAbsorb()
	{
		Pokemon_Ability_Constructor WaterAbsorb = new Pokemon_Ability_Constructor("Water Absorb", "Restores hp if hit by a water-type move instead of taking damage.", "III");
		return WaterAbsorb;
	}

	public static Pokemon_Ability_Constructor WaterBubble()
	{
		Pokemon_Ability_Constructor WaterBubble = new Pokemon_Ability_Constructor("Water Bubble", "Lowers the power of fire-type moves done to the pokemon and prevents the pokemon from getting a burn.", "VII");
		return WaterBubble;
	}

	public static Pokemon_Ability_Constructor WaterCompaction()
	{
		Pokemon_Ability_Constructor WaterCompaction = new Pokemon_Ability_Constructor("Water Compaction", "Boosts the pokemon's Defense stat sharply when hit by a water-type move.", "VII");
		return WaterCompaction;
	}

	public static Pokemon_Ability_Constructor WaterVeil()
	{
		Pokemon_Ability_Constructor WaterVeil = new Pokemon_Ability_Constructor("Water Veil", "The pokemon is covered with a water veil, which prevents the pokemon from getting a burn.", "III");
		return WaterVeil;
	}

	public static Pokemon_Ability_Constructor WeakArmor()
	{
		Pokemon_Ability_Constructor WeakArmor = new Pokemon_Ability_Constructor("Weak Armor", "Physical attacks to the pokemon lower its Defense stat but sharply raise its Speed stat.", "V");
		return WeakArmor;
	}

	public static Pokemon_Ability_Constructor WhiteSmoke()
	{
		Pokemon_Ability_Constructor WhiteSmoke = new Pokemon_Ability_Constructor("White Smoke", "The pokemon is protected by its white smoke, which prevents other pokemon from lowering its stats.", "III");
		return WhiteSmoke;
	}

	public static Pokemon_Ability_Constructor WimpOut()
	{
		Pokemon_Ability_Constructor WimpOut = new Pokemon_Ability_Constructor("Wimp Out", "The pokemon cowardly switches out when its hp becomes half or less.", "VII");
		return WimpOut;
	}

	public static Pokemon_Ability_Constructor WonderGuard()
	{
		Pokemon_Ability_Constructor WonderGuard = new Pokemon_Ability_Constructor("Wonder Guard", "Its mysterious power only lets supereffective moves hit the pokemon.", "III");
		return WonderGuard;
	}

	public static Pokemon_Ability_Constructor WonderSkin()
	{
		Pokemon_Ability_Constructor WonderSkin = new Pokemon_Ability_Constructor("Wonder Skin", "Makes status moves more likely to miss.", "V");
		return WonderSkin;
	}

	public static Pokemon_Ability_Constructor ZenMode()
	{
		Pokemon_Ability_Constructor ZenMode = new Pokemon_Ability_Constructor("Zen Mode", "Changes the pokemon's shape when hp is half or less.", "V");
		return ZenMode;
	}


}
