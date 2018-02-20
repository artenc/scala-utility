import org.scalatest.FlatSpec

import com.artenc.utility.BitUtility

class BitUtilitySpec extends FlatSpec
{
    "negative integer" should "be unsigned correctly" in {
        assert(BitUtility.intAsUnsigned(-53873) == 4294913423L)
    }
    "positive integer" should "be unsigned correctly" in {
        assert(BitUtility.intAsUnsigned(53873) == 53873L)
    }
}
