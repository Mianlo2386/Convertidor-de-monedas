import java.util.ArrayList;
public class ListadoDeMonedas {
    private static ArrayList<Moneda> listaMonedas; // Definir como campo de clase
    public static void mostrarListado() {
        if (listaMonedas != null && !listaMonedas.isEmpty()) {
            System.out.println("Listado de códigos de moneda:");
            for (Moneda moneda : listaMonedas) {
                System.out.println(moneda.getOpcion() + " - " +moneda.getCodigo() + " - " + moneda.getNombre());
            }
        } else {
            System.out.println("La lista de monedas está vacía o no ha sido inicializada.");
        }
    }
    public static ArrayList<Moneda> crearListaMonedas() {
        listaMonedas = new ArrayList<>();
        listaMonedas.add(new Moneda(1, "AED", "dirhams de los Emiratos Árabes Unidos"));
        listaMonedas.add(new Moneda(2, "AFN", "afganis de Afganistán"));
        listaMonedas.add(new Moneda(3, "ALL", "leks de Albania"));
        listaMonedas.add(new Moneda(4, "AMD", "drams armenios"));
        listaMonedas.add(new Moneda(5, "ANG", "florines de Antillas Neerlandesas"));
        listaMonedas.add(new Moneda(6, "AOA", "kwanza angoleños"));
        listaMonedas.add(new Moneda(7, "ARS", "pesos argentinos"));
        listaMonedas.add(new Moneda(8, "AUD", "dólares australianos"));
        listaMonedas.add(new Moneda(9, "AWG", "florines arubeños"));
        listaMonedas.add(new Moneda(10, "AZN", "manats de Azerbaiyán"));
        listaMonedas.add(new Moneda(11, "BAM", "Marco convertible de Bosnia y Herzegovina - Bosnia y Herzegovina"));
        listaMonedas.add(new Moneda(12, "BBD", "Dólar de Barbados - Barbados"));
        listaMonedas.add(new Moneda(13, "BDT", "Taka bangladesí - Bangladés"));
        listaMonedas.add(new Moneda(14, "BGN", "Lev búlgaro - Bulgaria"));
        listaMonedas.add(new Moneda(15, "BHD", "Dinar bahreiní - Baréin"));
        listaMonedas.add(new Moneda(16, "BIF", "Franco burundés - Burundi"));
        listaMonedas.add(new Moneda(17, "BMD", "Dólar bermudeño - Bermudas"));
        listaMonedas.add(new Moneda(18, "BND", "Dólar bruneano - Brunéi"));
        listaMonedas.add(new Moneda(19, "BOB", "Boliviano - Bolivia"));
        listaMonedas.add(new Moneda(20, "BRL", "Real brasileño - Brasil"));
        listaMonedas.add(new Moneda(21, "BSD", "Dólar bahameño - Bahamas"));
        listaMonedas.add(new Moneda(22, "BTN", "Ngultrum butanés - Bután"));
        listaMonedas.add(new Moneda(23, "BWP", "Pula botsuano - Botsuana"));
        listaMonedas.add(new Moneda(24, "BYN", "Rublo bielorruso - Bielorrusia"));
        listaMonedas.add(new Moneda(25, "BZD", "Dólar beliceño - Belice"));
        listaMonedas.add(new Moneda(26, "CAD", "Dólar canadiense - Canadá"));
        listaMonedas.add(new Moneda(27, "CDF", "Franco congoleño - República Democrática del Congo"));
        listaMonedas.add(new Moneda(28, "CHF", "Franco suizo - Suiza"));
        listaMonedas.add(new Moneda(29, "CLP", "Peso chileno - Chile"));
        listaMonedas.add(new Moneda(30, "CNY", "Yuan chino - China"));
        listaMonedas.add(new Moneda(31, "COP", "pesos colombianos"));
        listaMonedas.add(new Moneda(32, "CRC", "Colón costarricense - Costa Rica"));
        listaMonedas.add(new Moneda(33, "CUP", "Peso cubano - Cuba"));
        listaMonedas.add(new Moneda(34, "CVE", "Escudo caboverdiano - Cabo Verde"));
        listaMonedas.add(new Moneda(35, "CZK", "Corona checa - República Checa"));
        listaMonedas.add(new Moneda(36, "DJF", "Franco yibutiano - Yibuti"));
        listaMonedas.add(new Moneda(37, "DKK", "Corona danesa - Dinamarca"));
        listaMonedas.add(new Moneda(38, "DOP", "Peso dominicano - República Dominicana"));
        listaMonedas.add(new Moneda(39, "DZD", "Dinar argelino - Argelia"));
        listaMonedas.add(new Moneda(40, "EGP", "Libra egipcia - Egipto"));
        listaMonedas.add(new Moneda(41, "ERN", "Nakfa eritreo - Eritrea"));
        listaMonedas.add(new Moneda(42, "ETB", "Birr etíope - Etiopía"));
        listaMonedas.add(new Moneda(43, "EUR", "Euro - Unión Europea"));
        listaMonedas.add(new Moneda(44, "FJD", "Dólar fiyiano - Fiyi"));
        listaMonedas.add(new Moneda(45, "FKP", "Libra malvinense - Islas Malvinas"));
        listaMonedas.add(new Moneda(46, "FOK", "Corona feroesa - Islas Feroe"));
        listaMonedas.add(new Moneda(47, "GBP", "Libra esterlina - Reino Unido"));
        listaMonedas.add(new Moneda(48, "GEL", "Lari georgiano - Georgia"));
        listaMonedas.add(new Moneda(49, "GGP", "Libra de Guernsey - Guernsey"));
        listaMonedas.add(new Moneda(50, "GHS", "Cedi ghanés - Ghana"));
        listaMonedas.add(new Moneda(51, "GIP", "Libra gibraltareña - Gibraltar"));
        listaMonedas.add(new Moneda(52, "GMD", "Dalasi gambiano - Gambia"));
        listaMonedas.add(new Moneda(53, "GNF", "Franco guineano - Guinea"));
        listaMonedas.add(new Moneda(54, "GTQ", "Quetzal guatemalteco - Guatemala"));
        listaMonedas.add(new Moneda(55, "GYD", "Dólar guyanés - Guyana"));
        listaMonedas.add(new Moneda(56, "HKD", "Dólar de Hong Kong - Hong Kong"));
        listaMonedas.add(new Moneda(57, "HNL", "Lempira hondureño - Honduras"));
        listaMonedas.add(new Moneda(58, "HRK", "Kuna croata - Croacia"));
        listaMonedas.add(new Moneda(59, "HTG", "Gourde haitiano - Haití"));
        listaMonedas.add(new Moneda(60, "HUF", "Forinto húngaro - Hungría"));
        listaMonedas.add(new Moneda(61, "IDR", "Rupia indonesia - Indonesia"));
        listaMonedas.add(new Moneda(62, "ILS", "Nuevo shequel israelí - Israel"));
        listaMonedas.add(new Moneda(63, "IMP", "Libra manesa - Isla de Man"));
        listaMonedas.add(new Moneda(64, "INR", "Rupia india - India"));
        listaMonedas.add(new Moneda(65, "IQD", "Dinar iraquí - Irak"));
        listaMonedas.add(new Moneda(66, "IRR", "Rial iraní - Irán"));
        listaMonedas.add(new Moneda(67, "ISK", "Corona islandesa - Islandia"));
        listaMonedas.add(new Moneda(68, "JEP", "Libra de Jersey - Jersey"));
        listaMonedas.add(new Moneda(69, "JMD", "Dólar jamaicano - Jamaica"));
        listaMonedas.add(new Moneda(70, "JOD", "Dinar jordano - Jordania"));
        listaMonedas.add(new Moneda(71, "JPY", "Yen japonés - Japón"));
        listaMonedas.add(new Moneda(72, "KES", "Chelín keniano - Kenia"));
        listaMonedas.add(new Moneda(73, "KGS", "Som kirguís - Kirguistán"));
        listaMonedas.add(new Moneda(74, "KHR", "Riel camboyano - Camboya"));
        listaMonedas.add(new Moneda(75, "KID", "Dólar kiribatiano - Kiribati"));
        listaMonedas.add(new Moneda(76, "KMF", "Franco comorense - Comoras"));
        listaMonedas.add(new Moneda(77, "KRW", "Won surcoreano - Corea del Sur"));
        listaMonedas.add(new Moneda(78, "KWD", "Dinar kuwaití - Kuwait"));
        listaMonedas.add(new Moneda(79, "KYD", "Dólar de las Islas Caimán - Islas Caimán"));
        listaMonedas.add(new Moneda(80, "KZT", "Tenge kazajo - Kazajistán"));
        listaMonedas.add(new Moneda(81, "LAK", "Kip laosiano - Laos"));
        listaMonedas.add(new Moneda(82, "LBP", "Libra libanesa - Líbano"));
        listaMonedas.add(new Moneda(83, "LKR", "Rupia esrilanquesa - Sri Lanka"));
        listaMonedas.add(new Moneda(84, "LRD", "Dólar liberiano - Liberia"));
        listaMonedas.add(new Moneda(85, "LSL", "Loti lesothense - Lesoto"));
        listaMonedas.add(new Moneda(86, "LYD", "Dinar libio - Libia"));
        listaMonedas.add(new Moneda(87, "MAD", "Dirham marroquí - Marruecos"));
        listaMonedas.add(new Moneda(88, "MDL", "Leu moldavo - Moldavia"));
        listaMonedas.add(new Moneda(89, "MGA", "Ariary malgache - Madagascar"));
        listaMonedas.add(new Moneda(90, "MKD", "Denar macedonio - Macedonia del Norte"));
        listaMonedas.add(new Moneda(91, "MMK", "Kyat birmano - Birmania"));
        listaMonedas.add(new Moneda(92, "MNT", "Tugrik mongol - Mongolia"));
        listaMonedas.add(new Moneda(93, "MOP", "Pataca de Macao - Macao"));
        listaMonedas.add(new Moneda(94, "MRU", "Uguiya mauritano - Mauritania"));
        listaMonedas.add(new Moneda(95, "MUR", "Rupia mauriciana - Mauricio"));
        listaMonedas.add(new Moneda(96, "MVR", "Rupia de Maldivas - Maldivas"));
        listaMonedas.add(new Moneda(97, "MWK", "Kwacha malauí - Malaui"));
        listaMonedas.add(new Moneda(98, "MXN", "Peso mexicano - México"));
        listaMonedas.add(new Moneda(99, "MYR", "Ringgit malasio - Malasia"));
        listaMonedas.add(new Moneda(100, "MZN", "Metical mozambiqueño - Mozambique"));
        listaMonedas.add(new Moneda(101, "NAD", "Dólar namibio - Namibia"));
        listaMonedas.add(new Moneda(102, "NGN", "Naira nigeriana - Nigeria"));
        listaMonedas.add(new Moneda(103, "NIO", "Córdoba nicaragüense - Nicaragua"));
        listaMonedas.add(new Moneda(104, "NOK", "Corona noruega - Noruega"));
        listaMonedas.add(new Moneda(105, "NPR", "Rupia nepalí - Nepal"));
        listaMonedas.add(new Moneda(106, "NZD", "Dólar neozelandés - Nueva Zelanda"));
        listaMonedas.add(new Moneda(107, "OMR", "Rial omaní - Omán"));
        listaMonedas.add(new Moneda(108, "PAB", "Balboa panameño - Panamá"));
        listaMonedas.add(new Moneda(109, "PEN", "Sol peruano - Perú"));
        listaMonedas.add(new Moneda(110, "PGK", "Kina papuana - Papúa Nueva Guinea"));
        listaMonedas.add(new Moneda(111, "PHP", "Peso filipino - Filipinas"));
        listaMonedas.add(new Moneda(112, "PKR", "Rupia pakistaní - Pakistán"));
        listaMonedas.add(new Moneda(113, "PLN", "Zloty polaco - Polonia"));
        listaMonedas.add(new Moneda(114, "PYG", "Guaraní paraguayo - Paraguay"));
        listaMonedas.add(new Moneda(115, "QAR", "Riyal catarí - Catar"));
        listaMonedas.add(new Moneda(116, "RON", "Leu rumano - Rumanía"));
        listaMonedas.add(new Moneda(117, "RSD", "Dinar serbio - Serbia"));
        listaMonedas.add(new Moneda(118, "RUB", "Rublo ruso - Rusia"));
        listaMonedas.add(new Moneda(119, "RWF", "Franco ruandés - Ruanda"));
        listaMonedas.add(new Moneda(120, "SAR", "Riyal saudí - Arabia Saudita"));
        listaMonedas.add(new Moneda(121, "SBD", "Dólar de las Islas Salomón - Islas Salomón"));
        listaMonedas.add(new Moneda(122, "SCR", "Rupia seychelense - Seychelles"));
        listaMonedas.add(new Moneda(123, "SDG", "Libra sudanesa - Sudán"));
        listaMonedas.add(new Moneda(124, "SEK", "Corona sueca - Suecia"));
        listaMonedas.add(new Moneda(125, "SGD", "Dólar de Singapur - Singapur"));
        listaMonedas.add(new Moneda(126, "SHP", "Libra de Santa Elena - Santa Elena, Ascensión y Tristán de Acuña"));
        listaMonedas.add(new Moneda(127, "SLE", "Leone sierraleonés - Sierra Leona"));
        listaMonedas.add(new Moneda(128, "SOS", "Chelín somalí - Somalia"));
        listaMonedas.add(new Moneda(129, "SRD", "Dólar surinamés - Surinam"));
        listaMonedas.add(new Moneda(130, "SSP", "Libra sursudanesa - Sudán del Sur"));
        listaMonedas.add(new Moneda(131, "STN", "Dobra de Santo Tomé y Príncipe - Santo Tomé y Príncipe"));
        listaMonedas.add(new Moneda(132, "SYP", "Libra siria - Siria"));
        listaMonedas.add(new Moneda(133, "SZL", "Lilangeni esuatini - Eswatini"));
        listaMonedas.add(new Moneda(134, "THB", "Baht tailandés - Tailandia"));
        listaMonedas.add(new Moneda(135, "TJS", "Somoni tayiko - Tayikistán"));
        listaMonedas.add(new Moneda(136, "TMT", "Manat turcomano - Turkmenistán"));
        listaMonedas.add(new Moneda(137, "TND", "Dinar tunecino - Túnez"));
        listaMonedas.add(new Moneda(138, "TOP", "Pa'anga tongano - Tonga"));
        listaMonedas.add(new Moneda(139, "TRY", "Lira turca - Turquía"));
        listaMonedas.add(new Moneda(140, "TTD", "Dólar de Trinidad y Tobago - Trinidad y Tobago"));
        listaMonedas.add(new Moneda(141, "TVD", "Dólar tuvaluano - Tuvalu"));
        listaMonedas.add(new Moneda(142, "TWD", "Dólar taiwanés - Taiwán"));
        listaMonedas.add(new Moneda(143, "TZS", "Chelín tanzano - Tanzania"));
        listaMonedas.add(new Moneda(144, "UAH", "Grivna ucraniana - Ucrania"));
        listaMonedas.add(new Moneda(145, "UGX", "Chelín ugandés - Uganda"));
        listaMonedas.add(new Moneda(146, "USD", "dólares estadounidenses"));
        listaMonedas.add(new Moneda(147, "UYU", "Peso uruguayo - Uruguay"));
        listaMonedas.add(new Moneda(148, "UZS", "Som uzbeko - Uzbekistán"));
        listaMonedas.add(new Moneda(149, "VES", "Bolívar soberano venezolano - Venezuela"));
        listaMonedas.add(new Moneda(150, "VND", "Dong vietnamita - Vietnam"));
        listaMonedas.add(new Moneda(151, "VUV", "Vatu vanuatuense - Vanuatu"));
        listaMonedas.add(new Moneda(152, "WST", "Tala samoano - Samoa"));
        listaMonedas.add(new Moneda(153, "XAF", "Franco CFA de África Central - Comunidad Económica y Monetaria de África Central"));
        listaMonedas.add(new Moneda(154, "XCD", "Dólar del Caribe Oriental - Organización de Estados del Caribe Oriental"));
        listaMonedas.add(new Moneda(155, "XDR", "Derechos especiales de giro - Fondo Monetario Internacional"));
        listaMonedas.add(new Moneda(156, "XOF", "Franco CFA de África Occidental - Unión Económica y Monetaria de África Occidental"));
        listaMonedas.add(new Moneda(157, "XPF", "Franco CFP - Colectividades de Ultramar"));
        listaMonedas.add(new Moneda(158, "YER", "Rial yemení - Yemen"));
        listaMonedas.add(new Moneda(159, "ZAR", "Rand sudafricano - Sudáfrica"));
        listaMonedas.add(new Moneda(160, "ZMW", "Kwacha zambiano - Zambia"));
        listaMonedas.add(new Moneda(161, "ZWL", "Dólar zimbabuense - Zimbabue"));

        return listaMonedas;
    }
    public static String getNombreMoneda(int opcion) {
        if (listaMonedas != null) { // Verifica si listaMonedas se ha inicializado
            for (Moneda moneda : listaMonedas) {
                if (moneda.getOpcion() == opcion) {
                    return moneda.getNombre();
                }
            }
        }
        return null; // Devuelve null si listaMonedas es null o si no se encuentra la moneda
    }
    public static String getCodigoMoneda(int opcion) {
        if (listaMonedas != null) { // Verifica si listaMonedas se ha inicializado
            for (Moneda moneda : listaMonedas) {
                if (moneda.getOpcion() == opcion) {
                    return moneda.getCodigo();
                }
            }
        }
        return null; // Devuelve null si listaMonedas es null o si no se encuentra la moneda
    }
//    public static ArrayList<Moneda> getListaMonedas() {
//        return listaMonedas;
//    }

}

