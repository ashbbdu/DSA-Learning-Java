package BasisString;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        StringBuilder ans = new StringBuilder();
        String first = str[0];
        String last = str[str.length - 1];
        for(int i = 0 ; i < Math.min(first.length() , last.length()) ; i++) {
            if(first.charAt(i) == last.charAt(i)) {
                ans = ans.append(first.charAt(i));
            } else  {
                break;
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3 , 4, 5};
       String str [] = {"flower" , "flight" , "float", "flow" };
       String str1 [] = {"dog" , "cat" , "animal", "monkey"};
       String str2 [] = {"ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxolqwnshfdyvgzzkkwdwnrfbivdizbaxbhrnziklg","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxogmtbcwdapaymvrpkgnnlrgzenzrhggscehiekhmlzghm","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxofdlogmqzdyfgcdshclclpllpjkq","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoefdbjeawaxnzlynbjcrxrlerqiksaxfqsimdrmuu","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxosudkxgxnyabmphuwyqprmgoidonmcarope","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxomgwbcxjwjjsnctlbetyqwfjbluwn","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxowwuuqwpuwequcmqfskwjdvglaihvj","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxosnmeflohtzedblicnogwmpjlejmhyao","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxogknysgkhqjihdcenuzluceihkuytjnoklpxpkrzfidjybodok","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxogpqqpkfmaabgfkzjczshcddrhlxzbwvnvdfll","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoylhvhtjkzbwyrnozaadvwbyzccxgjotrfqjrj","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxojbdujrvdlsaanbkffyrnhbmiiavlaesqbrauynzutgqdin","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxobvkdkksxlwrcgmfzchkwurejmumttcgwygirvobuxo","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxodpszawuwtrfvyuwjcxsdyrefzotpbygulnaaawassultltiwyf","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoaozqoeopqsrafwdntfheldynkvfopxicpabwywcxl","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxouziezghylythqcsxkgqohlnpgfgnuw","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxocphkljicpfgsgnsuqlemrodvhdrlthopfm","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxomyhiszszfmxspnwcjzkskqdxctexwcrydmaptysmlgv","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoyhqorgwmoowcsrlldowkuxmnjbzfgqxeisstxuignnjcsuh","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxorhislepivxgysdfwvhtqrurekqoxdbxjufikurjhth","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoisqkxbibautpnarfrsvzqducxtjuxetlsgxolh","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxozelwojaushhstlxcfjljedbwuwwnukaybdhplvzbupt","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoadrfonokqfbpjabnxmfmbxxdsrgw","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxopkzdbjzrsgtcluvxqiawubbwxiydxee","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxohodbgycbygosfwjdabkvmgeftnkbuzakngixmofoj","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxodvgymdoonpqizishyuatfzscnluroqpbnhpubfxjgfparzgw","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxofthbusybulntaeeszwjuanjkrkxspuvrukrnyadsbrutp","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxofwidqqxgjsvvkunlxqvzrzxbnvflkdyjnxurgvplylfytxzqw","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxowhwafwjcgnpmyefenhyrgnfskptijgvbwjxulr","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoensxufnusrcaczzkzyklqitfbpdsrysihtkqeeqdllxxonuh","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoqajmtinhmdkydfaegywxjwvnlxdiaylc","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxosulqxhndwvfvtqkfhxhoftkjvpznyqdgepqlbeh","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxohtwcaiexgwlopebrvktbfgdyrfhchehlotdajqhevdm","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxopwrjdxmwzjnybjoclaywhehosqhmwplk","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxofhpsqyzaajgssmcmsmhncuflodsoywrziiajqhamfeyhtplo","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoccvtrhjtzinypkvdkzmtfeexensvap","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoahtsskafeojqudrfyhcvmqubziroctdtsxtsnazud","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxofybkiicvpuiayxhfddqutxjwqh","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoonjjvzuvogqbvyputwypzqwsnhxgicsxwxvlwr","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoncbgvmnsqgcqzbbotfzewdqdallilcayrlpbkwnzdjwuqmlk","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxomjaqdwdxkmudnjqwtvkmrgtmjpsygzvopzbjpqofdlwocr","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxovvllsqkswstqpxlxpmihoxugoqyshnkvkmibdfqbwegkizm","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxodfhspwagmqumcpftttkubvviqyncmriziv","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxodvlkrysgjopesbmegmwgqedani","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxokwoefzsqvbnurxyarpuadhhwnrhmpytjttcyzdhvmgpkzj","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxowfsszkujbokzyqluvklpqxsnceemecnzvqkhdcjyj","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxosdtkgsxvwdszfrijqvugewuhssiifopvgbodyxuixok","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxorfdqejwctcsnjhcusodokojtyswkiwodphryxcke","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxokkbltbvatwkgqyrphdqumvhzfonrvj","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxovkcrgvzwxhlbavnpbtwtynwrzurayoteqoavmz","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxomgiysvwxzysevhpxxekrkrgwjfaazjwfoinuijzimp","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxowyldjkzcregblcnrqenfqvzhljmxjcxurnjudtvvzmatk","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxotbctqywuaggnwmvithoskcyqht","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxotfadgaeujyaakemjlxmfpkeaqpfmoucydyywaj","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxovfjnwwdosalldybdyvtienjspvupb","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxopkmiwaztodjvdpapkvwwfxamtjbvcuksl","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxojcsksheyiaiwztlniznnzpsryihlekdtkyquahgc","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxoppmiidazukzeedvhyfnizfhfpfdajcwwscibntqiech","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxosxyeaytrdnumaezuhzgzazyessprmyrhezxclvpxakz","ddwugavygqmimrkadvoipxynqagwzfqgzzkphttqsfxohsyfchgqtkwtxmwyuqzpzdibfgzslklswghdooumev"};
        System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefix(str1));
        System.out.println(longestCommonPrefix(str2));


    }
}
