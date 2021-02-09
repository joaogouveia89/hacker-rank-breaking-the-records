def breaking_the_records scores
	response = [0, 0]
	lowest_score = scores[0]
	highest_score = lowest_score

	scores.each.with_index do |score, idx|
		unless idx === 0
			if score > highest_score
				highest_score = score
				response[0] = response[0] + 1
			end

			if score < lowest_score
				lowest_score = score
				response[1] = response[1] + 1
			end
		end 
	end
	return response
end