package com.vitualsenseltd.arnab.agrohelp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class machinery extends AppCompatActivity {

    MainActivity mainActivity=new MainActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machinery);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if(MainActivity.translate ==0){
        TextView txtDetails = (TextView) findViewById(R.id.textMachine);
        txtDetails.setText("TRACTOR - \n" +
                "A tractor is an engineering vehicle specifically designed to deliver a high tractive effort (or torque) at slow speeds, for the purposes of hauling a trailer or machinery used in agriculture or construction. Most commonly, the term is used to describe a farm vehicle that provides the power and traction to mechanize agricultural tasks, especially (and originally) tillage, but nowadays a great variety of tasks. Agricultural implements may be towed behind or mounted on the tractor, and the tractor may also provide a source of power if the implement is mechanised.\n" +
                "\n" +
                "CULTIVATOR -\n" +
                "Cultivators stir and pulverize the soil, either before planting (to aerate the soil and prepare a smooth, loose seedbed) or after the crop has begun growing (to kill weeds—controlled disturbance of the topsoil close to the crop plants kills the surrounding weeds by uprooting them, burying their leaves to disrupt their photosynthesis, or a combination of both). Unlike a harrow, which disturbs the entire surface of the soil, cultivators are designed to disturb the soil in careful patterns, sparing the crop plants but disrupting the weeds.\n" +
                "\n" +
                "CULTIPACKER -\n" +
                "A cultipacker is a piece of agricultural equipment that crushes dirt clods, removes air pockets, and presses down small stones, forming a smooth, firm seedbed. Where seed has been broadcast, the roller gently firms the soil around the seeds, ensuring shallow seed placement and excellent seed-to-soil contact.\n" +
                "\n" +
                "CHISEL PLOUGH -\n" +
                "The chisel plough is a common tool to get deep tillage (prepared land) with limited soil disruption. The main function of this plough is to loosen and aerate the soils while leaving crop residue at the top of the soil. This plough can be used to reduce the effects of compaction and to help break up ploughpan and hardpan. Unlike many other ploughs the chisel will not invert or turn the soil.\n" +
                "\n" +
                "SUBSOILER -\n" +
                "A subsoiler or flat lifter is a tractor-mounted farm implement used for deep tillage, loosening and breaking up soil at depths below the levels worked by moldboard ploughs, disc harrows, or rototillers. Most such tools will break up and turn over surface soil to a depth of 15–20 cm (6–8 in), whereas a subsoiler will break up and loosen soil to twice those depths. Typically a subsoiler mounted on a compact utility tractor will reach depths of about 30 cm (12 in) and typically have only one thin blade with a sharpened tip.\n" +
                "\n" +
                "MANURE SPREADER -\n" +
                "A manure spreader or muck spreader or honey wagon is an agricultural machine used to distribute manure over a field as a fertilizer. A typical (modern) manure spreader consists of a trailer towed behind a tractor with a rotating mechanism driven by the tractor's power take off (PTO).\n" +
                "\n" +
                "\n" +
                "SPRAYER -\n" +
                "A sprayer is a device used to spray a liquid. In agriculture, a sprayer is a piece of equipment that is used to apply herbicides, pesticides, and fertilizers on agricultural crops. Sprayers range in size from man-portable units (typically backpacks with spray guns) to trailed sprayers that are connected to a tractor, to self-propelled units similar to tractors, with boom mounts of 60–151 feet in length.\n" +
                "\n" +
                "FARM TRUCK -\n" +
                "A farm truck is a vehicle designated for agricultural use, and may include anything from small pick-up trucks or even vehicles fashioned out of old parts, to class 8 eighteen-wheeler trucks. Some states in the United States have a special registration for farm trucks that includes restrictions such as distance the vehicle may travel from the farm.\n" +
                "\n" +
                "COMBINE HARVESTOR -\n" +
                "The combine harvester, or simply combine, is a machine that harvests grain crops. The name derives from its combining three separate operations comprising harvesting—reaping, threshing, and winnowing—into a single process. Among the crops harvested with a combine are wheat, oats, rye, barley, corn (maize), sorghum, soybeans, flax (linseed), sunflowers, and canola. The waste straw left behind on the field is the remaining dried stems and leaves of the crop with limited nutrients which is either chopped and spread on the field or baled for feed and bedding for livestock.\n" +
                "\n" +
                "HAULM TOPPER -\n" +
                "A haulm topper is an agricultural machine that cuts potato stems (haulms) before potatoes are harvested. It is like a flail mower but has the profile of the potato drills. Modern potato farmers often mount a haulm topper on the front of the tractor and have a trailed potato harvester towed behind the tractor. Toppers can also be rear-mounted. It is a very efficient machine.\n" +
                "\n" +
                "SWATHER -\n" +
                "A swather, or windrower, is a farm implement that cuts hay or small grain crops and forms them into a windrow. A swather uses a sickle bar (see mower) to cut the stems of the crop. A reel helps the cut crop fall neatly onto a canvas or auger conveyor which moves it and deposits it into a windrow, with all stems oriented in the same direction. As combines replaced threshing machines, the swather was needed to replace the binder. The mown strip left behind is the swathe.\n" +
                "\n" +
                "WAGON -\n" +
                "A wagon is a heavy four-wheeled vehicle pulled by draught animals or on occasion by humans used for transporting goods, commodities, agricultural materials, supplies and sometimes people.\n" +
                "\n" +
                "BALER -\n" +
                "A baler, most often called a hay baler is a piece of farm machinery used to compress a cut and raked crop (such as hay, cotton, flax straw, salt marsh hay, or silage) into compact bales that are easy to handle, transport, and store. Often bales are configured to dry and preserve some intrinsic (e.g. the nutritional) value of the plants bundled. Several different types of balers are commonly used, each producing a different type of bale – rectangular or cylindrical, of various sizes, bound with twine, strapping, netting, or wire.\n" +
                "\n" +
                "TEDDER -\n" +
                "A tedder (also called hay tedder) is a machine used in haymaking. It is used after cutting and before windrowing, and uses moving forks to aerate or \"wuffle\" the hay and thus speed up the process of hay-making. The use of a tedder allows the hay to dry (\"cure\") better, which results in improved aroma and color.\n" +
                "\n" +
                " LOADER -\n" +
                "A loader is a heavy equipment machine used in construction to move aside or load materials such as asphalt, demolition debris, dirt, snow, feed, gravel, logs, raw minerals, recycled material, rock, sand, woodchips, etc. into or onto another type of machinery (such as a dump truck, conveyor belt, feed-hopper, or railroad car). There are many types of loader, which, depending on design and application, are called by various names, including bucket loader, front loader, front-end loader, payloader, scoop, shovel, skip loader, wheel loader, or skid-steer.\n" +
                "\n");
        }
        else{
        TextView txtDetails1 = (TextView) findViewById(R.id.textMachine);
        txtDetails1.setText("ट्रैक्टर -\n" +
                "ट्रैक्टर एक इंजीनियरिंग वाहन है जो विशेष रूप से कृषि या निर्माण में उपयोग किए जाने वाले ट्रेलर या मशीनरी को चलाने के प्रयोजनों के लिए धीमी गति पर एक उच्च ट्रैक्टिव प्रयास (या टोक़) देने के लिए डिज़ाइन किया गया है। सबसे अधिकतर, इस शब्द का प्रयोग खेत वाहन का वर्णन करने के लिए किया जाता है जो कि कृषि कार्यों को विशेष रूप से (और मूल रूप से) खेती के लिए मशीनीकरण करने की शक्ति और कर्षण प्रदान करता है, लेकिन आजकल बहुत सी कार्य हैं कृषि औजारों को ट्रैक्टर पर पीछे या घुड़सवार किया जा सकता है, और यदि ट्रैफिक मैकेनाइज्ड है तो ट्रक्टर शक्ति का स्रोत भी प्रदान कर सकता है।\n" +
                "\n" +
                "खेल्विक -\n" +
                "खेती करने से पहले खेती करने से पहले (मिट्टी को हराकर और चिकनी, ढीले सीढ़ी तैयार करने के लिए) मृदा को हलचल और चूर्ण बनाते हैं या फसल के बढ़ने से पहले (फसल पौधों के करीब ऊपरी-छिद्र की तबाही-नियंत्रित गड़बड़ी को मारने के लिए आसपास के मातम को मार डाला जाता है) उन्हें ऊपर उठाना, अपने पत्ते को अपने प्रकाश संश्लेषण को बाधित करने, या दोनों के संयोजन को दफनाने के लिए)। एक हैरो के विपरीत, जो मिट्टी की पूरी सतह को परेशान करती है, किसानों को सावधानीपूर्वक पैटर्न में मिट्टी को परेशान करने के लिए तैयार किया जाता है, फसल के पौधों को छोड़कर, घास को बाधित कर सकता है।\n" +
                "\n" +
                "कलटेपेकर-\n" +
                "एक कपासिपकर एक कृषि उपकरण का एक टुकड़ा है जो गंदगी की बूंदों को उड़ता है, हवा की जेब को हटाता है, और छोटे पत्थरों को दबाता है, एक चिकनी, फर्म सब्जी का गठन करता है। जहां बीज प्रसारित किया गया है, रोलर धीरे-धीरे बीज के चारों ओर की मिट्टी का उत्पादन करता है, उथले बीज स्थान और उत्कृष्ट बीज-से-मिट्टी संपर्क सुनिश्चित करता है।\n" +
                "\n" +
                "क्रिसल प्लेव -\n" +
                "सीमित मिट्टी की व्यवधान के साथ गहरी जुताई (तैयार भूमि) प्राप्त करने के लिए छेनी हल एक सामान्य उपकरण है इस हल का मुख्य कार्य मृदा के शीर्ष पर फसल के अवशेषों को छोड़कर मिट्टी को ढंकने और जड़ना है। इस हल को संघनन के प्रभावों को कम करने और प्लॉप्पन और हार्डपेन को तोड़ने में मदद के लिए इस्तेमाल किया जा सकता है। कई अन्य हलकों के विपरीत छेनी मिट्टी को उलटा या बारी नहीं करती।\n" +
                "\n" +
                "उपनगर -\n" +
                "एक सबसॉइलर या फ्लैट चोर एक ट्रैक्टर-माउंटेड फार्म का कार्यान्वयन है, जो गहरी जुताई के लिए इस्तेमाल किया जाता है, ढालना बोर्ड हलकों, डिस्क बिररा या रोटोटिलर द्वारा काम के स्तर के नीचे गहराई पर ढलान और मटकी तोड़ता है। अधिकांश ऐसे उपकरण टूट जाएंगे और सतह की मिट्टी को 15-20 सेमी (6-8 इंच) की गहराई में बदल देंगे, जबकि एक सबसैलर टूट जाएगा और मिट्टी को दो गहराई तक ढीली कर देगा। आम तौर पर कॉम्पैक्ट यूटिलिटी ट्रेक्टर पर माउंट किए जाने वाले उपसॉइलर लगभग 30 सेमी (12 इंच) की गहराई तक पहुंच जाएगा और आमतौर पर केवल एक पतली ब्लेड एक तेज़ टिप के साथ होगा\n" +
                "\n" +
                "खाद छिड़कने का उपकरण -\n" +
                "एक खाद स्प्रेडर या मक स्प्रेडर या शहद वॅगन एक कृषि मशीन है जिसे एक उर्वरक के रूप में एक खेत पर खाद वितरित किया जाता है। एक ठेठ (आधुनिक) खाद के स्प्रेडर में ट्रैक्टर के पावर ले ऑफ (पीटीओ) द्वारा संचालित एक घूर्णन तंत्र के साथ ट्रैक्टर के पीछे एक ट्रेलर होता है।\n" +
                "\n" +
                "\n" +
                "स्प्रेयर -\n" +
                "एक स्प्रेयर एक तरल पदार्थ स्प्रे करने के लिए एक उपकरण है। कृषि में, एक स्प्रेयर उपकरण का एक टुकड़ा है जो कि कृषि फसलों पर हेर्बिसिड, कीटनाशकों और उर्वरकों को लागू करने के लिए उपयोग किया जाता है। स्प्रेर्स लंबाई वाले 60-151 फीट की लंबाई के साथ मानव-पोर्टेबल इकाइयां (आमतौर पर स्प्रे बंदूक के साथ बैकपैक्स) के लिए ट्रैक्टर से जुड़ा स्प्रेयर, ट्रैक्टर से जुड़े स्वचालित इकाइयां, के आकार में होते हैं।\n" +
                "\n" +
                "कृषि ट्रक -\n" +
                "एक खेत ट्रक कृषि उपयोग के लिए नामित एक वाहन है, और छोटे पिक-अप ट्रकों या पुराने वाहनों के बाहर के वाहनों से भी कुछ भी शामिल हो सकता है, जहां तक \u200B\u200B8 अठारह-व्हीलर ट्रक शामिल हैं। संयुक्त राज्य अमेरिका के कुछ राज्यों में खेत के ट्रकों के लिए एक विशेष पंजीकरण है जिसमें प्रतिबंध शामिल है जैसे वाहन खेत से यात्रा कर सकता है।\n" +
                "\n" +
                "कम्बाइन हार्वेस्टर -\n" +
                "गठबंधन फ़सल काटने की मशीन, या बस गठबंधन, एक मशीन है जो अनाज फसलों का फसल है। इसका नाम एक ही प्रक्रिया में फसल कटाई-कटाई, खसनी, और विनोइंग-जिसमें तीन अलग-अलग आपरेशनों के संयोजन से प्राप्त होता है। गठबंधन के साथ फसलों की फसलों में गेहूं, जई, राई, जौ, मक्का (मक्का), ज्वार, सोयाबीन, सन (अलसी), सूरजमुखी, और कैनोला हैं। मैदान पर पीछे की बर्बादी का भूरा शेष सूखा उपजी है और फसल की पत्तियों को सीमित पोषक तत्वों के साथ होता है जो या तो कटा हुआ होता है और मैदान पर फैलता है या पशुओं के लिए भोजन और बिस्तर के लिए बाला होता है।\n" +
                "\n" +
                "हौलम टॉपर -\n" +
                "एक ढोना टापर एक कृषि मशीन है जो आलू की कटाई से पहले आलू का उत्पादन करता है (हथेलियां)। यह एक भुननेवाला की तरह है, लेकिन आलू अभ्यासों का प्रोफाइल है। आधुनिक आलू के किसान अक्सर ट्रेक्टर के सामने एक घुड़दौड़ का घोड़ा माउंट करते हैं और ट्रेक्टर के पीछे एक आलू के फसल काटने वाले यंत्र का दौरा पड़ता है। टॉपर्स भी पीछे-माउंट हो सकते हैं यह एक बहुत ही कुशल मशीन है\n" +
                "\n" +
                "स्वार्थी -\n" +
                "एक सशक्त, या वाइन्डर, एक खेत है जो कि घास या छोटे अनाज फसलों में कटौती करता है और उन्हें विन्ड्रो में डालता है एक सफ़ाई फसल के उपजी में कटौती करने के लिए एक सिकल बार (मॉवर देखें) का उपयोग करता है। एक रील कटाई में कटौती में मदद करता है जो एक कैनवास या गले लगाने वाले कन्वेयर पर चलता है और इसे एक विन्ड्रो में जमा कर देता है, सभी दिशाओं में एक ही दिशा में उन्मुख होता है। जैसा कि थ्रेसिंग मशीनों को बदलती है, बांधने की जगह बदलने के लिए सशस्त्र ज़रूरी था। पीछे छोड़ दिया मोनोग्राम पट्टी swathe है\n" +
                "\n" +
                "वैगॉन -\n" +
                "एक वैगन भारी है चार-पहिया वाहन मसौदा जानवरों द्वारा खींचा जाता है या किसी अवसर पर वस्तुओं, वस्तुओं, कृषि सामग्री, आपूर्ति और कभी-कभी लोगों के परिवहन के लिए इस्तेमाल किए गए मानव द्वारा।\n" +
                "\n" +
                "बेलर -\n" +
                "एक बेलर, जिसे अक्सर पिघल बेलर कहा जाता है, एक कटा हुआ और कटा हुआ फसल (जैसे घास, कपास, सन की भूसी, नमक दलहन घास या सिलेज) को कॉम्पैक्ट बैल्स में संसाधित करने के लिए प्रयुक्त कृषि मशीनरी का एक टुकड़ा है, जो कि संभालना आसान है, परिवहन , और दुकान। अक्सर गांठों को बंडल करने वाले पौधों के कुछ आंतरिक (उदा। पोषण) मूल्य को सूखा और संरक्षित करने के लिए कॉन्फ़िगर किया जाता है। कई अलग-अलग प्रकार के balers आमतौर पर इस्तेमाल होते हैं, प्रत्येक एक अलग प्रकार के गठरी का उत्पादन करते हैं - आयताकार या बेलनाकार, विभिन्न आकारों में, सुतली, दीर्घकाय, जाल या तार के साथ बाध्य।\n" +
                "\n" +
                "टेडर -\n" +
                "एक टेडर (जिसे हे टेडर भी कहा जाता है) हेमामेकिंग में इस्तेमाल की जाने वाली एक मशीन है। इसका उपयोग कटाई और हवाओं से पहले करने के बाद किया जाता है, और घाटियों को \"वाफल\" या \"वाफमल\" के लिए कालों का उपयोग करता है और इस तरह घास बनाने की प्रक्रिया में तेजी लाता है। टेडर का उपयोग घास को सूखा (\"इलाज\") बेहतर करने की अनुमति देता है, जिससे सुगंध और रंग में सुधार होता है।\n" +
                "\n" +
                "लोडर -\n" +
                "एक लोडर एक भारी उपकरण मशीन है जिसे निर्माण में इस्तेमाल किया जाता है, जैसे डामर, विध्वंस मलबे, गंदगी, बर्फ, फीड, बजरी, लॉग, कच्चे खनिज, पुनर्नवीनीकरण सामग्री, रॉक, रेत, फूक्छिप इत्यादि जैसे कि एक तरफ या लोड सामग्री एक अन्य प्रकार की मशीनरी (जैसे डंप ट्रक, कन्वेयर बेल्ट, फीड-हॉपर, या रेल कार)। कई प्रकार के लोडर हैं, जो डिजाइन और आवेदन के आधार पर, बाल्टी लोडर, मोर्चे लोडर, फ़्रंट-एंड लोडर, पेलोडर, स्कूप, फावल, स्किप लोडर, व्हील लोडर या स्किड स्टीयर सहित विभिन्न नामों से बुलाए जाते हैं।");
            }
        Button button=(Button)findViewById(R.id.buyButton);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(machinery.this,machineryBuy.class);
                        startActivity(intent);
                    }
                }
        );
        }
    }


