package demo.domain

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class OrderTest extends Specification {
    @Shared
    Order order

    def setupSpec() {
        order = new Order(10, "item", 25)
    }

    @Unroll("#quant")
    def "GetQuantity"() {
        expect:
        order.setQuantity(quant)
        order.getQuantity() == result
        where:
        quant << [1, -1]
        result << [1, -1]
    }

    @Unroll("#quant")
    def "SetQuantity"() {
        expect:
        order.setQuantity(quant).getQuantity() == result
        where:
        quant << [1, -1]
        result << [1, -1]

    }

    @Unroll("#item")
    def "GetItemName"() {
        expect:
        order.setItemName(item)
        order.getItemName() == result
        where:
        item << ["apple", "banana"]
        result << ["apple", "banana"]


    }

    @Unroll("#item")
    def "SetItemName"() {

        expect:
        order.setItemName(item).getItemName() == result
        where:
        item << ["apple", "banana"]
        result << ["apple", "banana"]



    }

    @Unroll("#price")
    def "GetPrice"() {
        expect:
        order.setPrice(price)
        order.getPrice() == result
        where:
        price << [1, -1]
        result << [1, -1]


    }

    @Unroll("#price")
    def "SetPrice"() {
        expect:
        order.setPrice(price).getPrice() == result
        where:
        price << [1, -1]
        result << [1, -1]



    }

    @Unroll("#priceWithTex ")
    def "GetPriceWithTex"() {

        expect:
        order.setPriceWithTex(priceWithTex)
        order.getPriceWithTex() == result
        where:
        priceWithTex << [1, -1]
        result << [1, -1]
    }
    @Unroll("#priceWithTex ")
    def "SetPriceWithTex"() {
        expect:
        order.setPriceWithTex(priceWithTex).getPriceWithTex() == result
        where:
        priceWithTex << [1, -1]
        result << [1, -1]
    }
}
