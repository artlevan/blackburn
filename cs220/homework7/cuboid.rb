#Arthur Levan
#Estimated Time Two Hours

class Cuboid
    attr_reader :height, :width, :depth

    def initialize(height, width, depth)
        @height = height
        @width = width
        @depth = depth
    end

    def calculate_area()
        2*(@width*@height + @depth*@height + @width*@depth)
    end

    def calculate_volume()
        @width*@height*@depth
    end

    def height=(newheight)
        if newheight == 0
            puts "Can't make height 0"
        else
            @height = newheight
        end
    end

    def width=(newwidth)
        if newwidth == 0
            puts "Can't make width 0"
        else 
            @width = newwidth
        end
    end

    def depth=(newdepth)
        if newdepth == 0
            puts "Can't make depth 0"
        else 
            @depth = newdepth
        end
    end
end

if __FILE__ == $0
    c = Cuboid.new(1,2,3)
	puts "Height is #{c.height}"
	puts "Width is #{c.width}"
	puts "Depth is #{c.depth}"
	print "The volume is "
	puts c.calculate_volume()
	print "The surface area is "
	puts c.calculate_area()
	print "Please select a field to change "
	input = gets	
	if input == "depth"
		puts "Enter a new value for " + #{input}
		value = gets
		c.depth(value)
	end
	puts "End of File"
end
