#Arthur Levan
#Estimated Time: 2 Hours
#Actual Time: 3 Hours
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

    def set_height(newheight)
        if newheight == 0
            puts "Can't make height 0"
        else
            @height = newheight
        end
    end

    def set_width(newwidth)
        if newwidth == 0
            puts "Can't make width 0"
        else 
            @width = newwidth
        end
    end

    def set_depth(newdepth)
        if newdepth == 0
            puts "Can't make depth 0"
        else 
            @depth = newdepth
        end
    end

    def numbers()
	puts "Height is " + @height.to_s
	puts "Width is " + @width.to_s
	puts "depth is " + @depth.to_s
	print "The Volume is "
	puts calculate_volume()
	print "The Area is "
	puts calculate_area()
    end

    def input()
	print "Please enter a Field to change "
	field = gets.chomp.downcase
	puts "Enter a new value for #{field}"
	newvalue = gets.chomp
	value = newvalue.to_i
	if field == "depth"
		set_depth(value)
	elsif field == "height"
		set_height(value)
	elsif field == "width"
		set_width(value)
	end
    end

end	

if __FILE__ == $0
    c = Cuboid.new(1,2,3)
	puts c.numbers
	while
	c.input()
	puts "The new numbers are "
	puts c.numbers()
	puts "Would you like to change a field? (Y/N)"
	input = gets.chomp.upcase
		if input == "N"
			break
		end
	end
end

