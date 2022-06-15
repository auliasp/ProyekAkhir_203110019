package id.auliasalsabila.dramakorea

object DrakorData {
    private val drakorNames = arrayOf("Bussiness Proposal",
        "Crash Landing On You",
        "Descendant Of The Sun",
        "Happiness",
        "Shooting Star",
        "Snowdrop",
        "Squidgame",
        "W (Two World)",
        "Weightlifting Fairy KimBookJoo",
        "Penthouse 1",
        "Romance is Bonus Book")

    private val drakorDetails = arrayOf(
        "Business Proposal (Korean: 사내 맞선; Hanja: 社內맞선; RR: Sanae Matseon; lit. The Office Blind Date) is a South Korean romantic comedy television series based on the webtoon of the same title written by HaeHwa and illustrated by Narak. Directed by Park Seon-ho and written by Han Seol-hee and Hong Bo-hee, it stars Ahn Hyo-seop, Kim Se-jeong, Kim Min-kyu, and Seol In-ah. It tells the story of Shin Ha-ri, an employee who accepts to go on a blind date in place of her friend, but finds out that her date is actually her boss. The series aired for 12 episodes on SBS TV every Monday and Tuesday at 22:00 (KST) from February 28 to April 5, 2022. It is also available for streaming on Netflix in selected regions.",
        "Crash Landing on You (Hangul: 사랑의 불시착 ; RR: Sarangui Bulsichak; lit. Love's Emergency Landing) adalah seri televisi Korea Selatan tahun 2019 yang dibintangi oleh Hyun Bin, Son Ye-jin, Kim Jung-hyun, dan Seo Ji-hye. Drama ini ditayangkan setiap Sabtu dan Minggu pukul 21:00 (WSK) di tvN mulai 14 Desember 2019 hingga 16 Februari 2020.",
        "Descendants of the Sun (Korean: 태양의 후예; Hanja: 太陽의 後裔; RR: Taeyang-ui Huye) is a 2016 South Korean television series starring Song Joong-ki, Song Hye-kyo, Jin Goo, and Kim Ji-won.[3][4][5] It aired on KBS2 from February 24 to April 14, 2016 for 16 episodes.[6] KBS then aired three additional special episodes from April 20 to April 22, 2016 containing highlights and the best scenes from the series, the drama's production process, behind-the-scenes footage, commentaries from cast members and the final epilogue",
        "Happiness (Korean: 해피니스; RR: Haepiniseu) is a South Korean television series starring Han Hyo-joo, Park Hyung-sik, and Jo Woo-jin, produced by Studio Dragon. It is an apocalyptic thriller that takes place in a time in which infectious diseases have become the new norm.[2] It premiered on tvN on November 5, 2021 and aired every Friday and Saturday at 22:40 (KST) for 12 episodes.[3][4] It is also available for streaming on Viki, Viu, Netflix, and iQIYI in selected territories.",
        "Shooting Stars[4][5] (Korean: 별똥별; RR: Byeolttongbyeol) is a 2022 South Korean television series starring Lee Sung-kyung and Kim Young-dae. It premiered on tvN on April 22, 2022, and aired every Friday and Saturday at 22:40 (KST) with 16 episodes.[6][7] It is also available for streaming on iQIYI in selected regions",
        "Snowdrop (Korean: 설강화; Hanja: 雪降花; RR: Seolganghwa) is a South Korean television series starring Jung Hae-in, Jisoo, Yoo In-na, Jang Seung-jo, Yoon Se-ah, Kim Hye-yoon, and Jung Yoo-jin. It aired on JTBC from December 18, 2021, to January 30, 2022, every Saturday and Sunday at 22:30 (KST) for 16 episodes.",
        "Squid Game (Korean: 오징어 게임; RR: Ojing-eo Geim) is a South Korean survival drama television series created by Hwang Dong-hyuk for Netflix. Its cast includes Lee Jung-jae, Park Hae-soo, Wi Ha-joon, HoYeon Jung, O Yeong-su, Heo Sung-tae, Anupam Tripathi, and Kim Joo-ryoung.",
        "W (Korean: 더블유; RR: Deobeuryu) is a 2016 South Korean television series, starring Lee Jong-suk and Han Hyo-joo.[1][2] Consisting of 16 episodes, it aired on Wednesdays and Thursdays at 22:00 (KST) on MBC from July 20 to September 14, 2016.[3] W centers on the clash between two worlds: the real world and an alternate universe inside a webtoon, from which the title of the television series was taken.",
        "Weightlifting Fairy Kim Bok-joo (Korean: 역도요정 김복주; RR: Yeokdoyojeong Gimbokju) is a 2016–2017 South Korean television series starring Lee Sung-kyung in the title role, with Nam Joo-hyuk. It is a coming-of-age sports drama, inspired by the life of Olympic gold-medalist Jang Mi-ran.[1][2] It aired on MBC every Wednesday and Thursday at 22:00 (KST) from November 16, 2016, to January 11, 2017.The series resonated with the young demographic; although it averaged 4.6% in audience share and received the lowest viewership ratings in its time-slot throughout its run,[3][4] it gained a cult following amongst young viewers and received mostly favorable reviews.[5][6] The series also received popularity overseas, particularly in the Philippines.",
        "The Penthouse: War in Life (Hangul: 펜트하우스; RR: Penteuhauseu; lit. Penthouse) adalah seri televisi Korea Selatan tahun 2020 yang dibintangi oleh Lee Ji-ah, Kim So-yeon, Eugene, Um Ki-joon, Park Eun-seok, Bong Tae-gyu, dan Yoon Joo-hee.[1][2][3] Drama ini disiarkan di SBS TV[4] dan teori dari drama ini dipakai secara tidak resmi oleh dua sinetron Buku Harian Seorang Istri dan Suster El.",
        "Romance Is a Bonus Book[1] (Korean: 로맨스는 별책부록; RR: Romaenseuneun Byeolchaekburok) is a 2019 South Korean television series starring Lee Na-young and Lee Jong-suk.[2][3] It aired from January 26 to March 17, 2019 on tvN")

    private val drakorImages = intArrayOf(R.drawable.bussiness,
        R.drawable.crash,
        R.drawable.dots,
        R.drawable.happiness,
        R.drawable.shooting,
        R.drawable.snow,
        R.drawable.squid,
        R.drawable.w,
        R.drawable.weight,
        R.drawable.penthouse1,
        R.drawable.romance )

    val listData: ArrayList<Drakor>
        get() {
            val list = arrayListOf<Drakor>()
            for (position in drakorNames.indices) {
                val drakor = Drakor()
                drakor.name = drakorNames[position]
                drakor.detail = drakorDetails[position]
                drakor.photo = drakorImages[position]
                list.add(drakor)
            }
            return list
        }
}
