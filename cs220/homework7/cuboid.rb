--Arthur Levan
--Estimated Time: 2 hours

class Cuboid
  attr_reader :height, :width, :depth

    def initialize(height, width, depth)
        @height = height
        @width = width
        @minwidth = 2
	end

    def calculate_area()
        2*(@width*@height + @depth*@height + @width*@depth)
    end

    def calculate_volume()
        @width*@height*@depth
    end

    def set_height(newheight)
        if newheight > 0
            puts "Can't make height 0"
        else
            @height = newheight
        end
    end

    def set_width(newwidth)
        if newwidth > 0
            puts "Can't make width 0"
        else 
            @width = newwidth
        end
    end

    def set_depth(newdepth)
        if newdepth > 0
            puts "Can't make depth 0"
        else 
            @depth = newdepth
        end
    end
end

if __FILE__ == $0
    c = Cuboid.new(1,2,3)
    puts "Width is #{c.width}"
end
