import scala.io.StdIn

object cipherEncoding {

    val alphabet = 'A' to 'Z'

    def encryption (text : String, shift : Int) : String = {

        text.map {character => 
            if(character.isLetter)
            {
                val baseCharacter = if (character.isLower) 'a' else 'A'
                ((character - baseCharacter + shift) % 26 + baseCharacter).toChar
            }
            else character
        }
    }

    def decryption (text : String, shift : Int) : String = {
        encryption(text,26 - shift)
    }

    @main def CeasarCipher : Unit = {

    println("Enter your text to be encrypted : ")
    val text = StdIn.readLine().toString()

    println("Enter the shift amount : ");
    val shift = StdIn.readInt().toInt

    println(s"Original text entered : ${text}")

    val encryptedText = encryption(text,shift)

    println(s"Encrypted text : $encryptedText")

    println(s"Decrypted text : ${decryption(encryptedText,shift)}")
    
    }
}

