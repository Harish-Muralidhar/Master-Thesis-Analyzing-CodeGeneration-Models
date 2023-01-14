'''
'''
import math

def get_trip_clan_f(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    else:
        x_pos_f = trip_clan[0][0]
        if x_pos >= x_pos_f:
            return 0
        else:
            return -1

def get_trip_clan_l(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    elif len(trip_clan) == 1:
        x_pos_l = trip_clan[0][0]
        if x_pos >= x_pos_l:
            return 0
        else:
            return -1
    else:
        x_pos_l = trip_clan[-1][0]
        if x_pos >= x_pos_l:
            return len(trip_clan) - 1
        else:
            left = 0
            right = len(trip_clan) - 1
            while left < right:
                mid = (left + right) / 2
                if x_pos <= trip_clan[mid][0]:
                    right = mid
                else:
                    left = mid + 1
            return right - 1

def get_trip_clan_r(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    elif len(trip_clan) == 1:
        x_pos_l = trip_clan[0][0]
        if x_pos >= x_pos_l:
            return 0
        else:
            return -1
    else:
        x_pos_l = trip_clan[-1][0]
        if x_pos >= x_pos_l:
            return len(trip_clan) - 1
        else:
            left = 0
            right = len(trip_clan) - 1
            while left < right:
                mid = (left + right) / 2
                if x_pos <= trip_clan[mid][0]:
                    right = mid
                else:
                    left = mid + 1
            return right

def get_trip_clan_ll(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    elif len(trip_clan) == 1:
        x_pos_l = trip_clan[0][0]
        if x_pos >= x_pos_l:
            return 0
        else:
            return -1
    else:
        x_pos_l = trip_clan[-1][0]
        if x_pos >= x_pos_l:
            return len(trip_clan) - 1
        else:
            left = 0
            right = len(trip_clan) - 1
            while left < right:
                mid = (left + right) / 2
                if x_pos <= trip_clan[mid][0]:
                    right = mid
                else:
                    left = mid + 1
            return right - 2

def get_trip_clan_rr(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    elif len(trip_clan) == 1:
        x_pos_l = trip_clan[0][0]
        if x_pos >= x_pos_l:
            return 0
        else:
            return -1
    else:
        x_pos_l = trip_clan[-1][0]
        if x_pos >= x_pos_l:
            return len(trip_clan) - 1
        else:
            left = 0
            right = len(trip_clan) - 1
            while left < right:
                mid = (left + right) / 2
                if x_pos <= trip_clan[mid][0]:
                    right = mid
                else:
                    left = mid + 1
            return right + 1

def get_trip_clan_lll(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    elif len(trip_clan) == 1:
        x_pos_l = trip_clan[0][0]
        if x_pos >= x_pos_l:
            return 0
        else:
            return -1
    else:
        x_pos_l = trip_clan[-1][0]
        if x_pos >= x_pos_l:
            return len(trip_clan) - 1
        else:
            left = 0
            right = len(trip_clan) - 1
            while left < right:
                mid = (left + right) / 2
                if x_pos <= trip_clan[mid][0]:
                    right = mid
                else:
                    left = mid + 1
            return right - 3

def get_trip_clan_rrr(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    elif len(trip_clan) == 1:
        x_pos_l = trip_clan[0][0]
        if x_pos >= x_pos_l:
            return 0
        else:
            return -1
    else:
        x_pos_l = trip_clan[-1][0]
        if x_pos >= x_pos_l:
            return len(trip_clan) - 1
        else:
            left = 0
            right = len(trip_clan) - 1
            while left < right:
                mid = (left + right) / 2
                if x_pos <= trip_clan[mid][0]:
                    right = mid
                else:
                    left = mid + 1
            return right + 2

def get_trip_clan_llll(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    elif len(trip_clan) == 1:
        x_pos_l = trip_clan[0][0]
        if x_pos >= x_pos_l:
            return 0
        else:
            return -1
    else:
        x_pos_l = trip_clan[-1][0]
        if x_pos >= x_pos_l:
            return len(trip_clan) - 1
        else:
            left = 0
            right = len(trip_clan) - 1
            while left < right:
                mid = (left + right) / 2
                if x_pos <= trip_clan[mid][0]:
                    right = mid
                else:
                    left = mid + 1
            return right - 4

def get_trip_clan_rrrr(x_pos, trip_clan):
    if len(trip_clan) == 0:
        return -1
    elif len(trip_clan) == 1:
        x_pos_l = trip_clan[0][0]
        if x_pos >= x_pos_l:
            return 0
        else:
            return -1
    else:
        x_pos_l = trip_clan[-1][0]
        if x_pos >= x_pos_l:
            return len(trip_clan) - 1
        else:
            left = 0
            right = len(trip_clan) - 1
            while left < right:
                mid = (left + right) / 2
                if x_pos <= trip_clan[mid][0]:
                    right = mid
                else:
                    left = mid + 1
            return right + 3

def solve_case(x_end, dis, trip_clan):
    # x_end: targer x
    # dis: dish info
    # trip_clan: trip clan info
    # part = [x, y, r]
    # return min(num)
    #n = 0
    #n = get_trip_clan_l(x_end, trip_clan)
    #print 'n:', n
    #if x_end < dis[0][0]:
    #    return dis[0][1]
    #elif x_end < dis[-1][0]:
    #    t = int(x_end - dis[0][0])
    #    return t * dis[0][1] + (dis[0][1] - dis[1][1]) * (t - 1) / 2 + dis[1][1]
    #if len(trip_clan) == 0:
    #    return dis[-1][1]
    #if x_end < trip_clan[0][0]:
    #    return dis[-1][1]
    #if x_end > trip_clan[-1][0]:
    #    t = int(x_end - trip_clan[-1][0])
    #    return t * trip_clan[-1][1] + (trip_clan[-1][1] - trip_clan[-2][1]) * (t - 1) / 2 + trip_clan[-2][1]
    #print dis
    #print trip_clan
    if len(trip_clan) == 0:
        return dis[-1][1]
    if x_end < trip_clan[0][0]:
        return dis[-1][1]
    if x_end > trip_clan[-1][0]:
        return trip_clan[-1][1]
    #print 'xxx'
    l = get_trip_clan_l(x_end, trip_clan)
    r = get_trip_clan_r(x_end, trip_clan)
    ll = get_trip_clan_ll(x_end, trip_clan)
    rr = get_trip_clan_rr(x_end, trip_clan)
    lll = get_trip_clan_lll(x_end, trip_clan)
    rrr = get_trip_clan_rrr(x_end, trip_clan)
    llll = get_trip_clan_llll(x_end, trip_clan)
    rrrr = get_trip_clan_rrrr(x_end, trip_clan)
    #print 'l, r, ll, rr, lll, rrr, llll, rrrr:'
    #print l, r, ll, rr, lll, rrr, llll, rrrr
    #print trip_clan
    #print 'llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll'
    #if l == ll:
    #    if l == lll:
    #        if l == llll:
    #            return trip_clan[r][1]
    #        else:
    #            if llll == -1:
    #                return trip_clan[r][1]
    #            else:
    #                if x_end - trip_clan[llll][0] >= trip_clan[llll][1]:
    #                    return trip_clan[r][1]
    #                else:
    #                    return trip_clan[llll][1]
    #    else:
    #        if lll == -1:
    #            return trip_clan[r][1]
    #        else:
    #            if x_end - trip_clan[lll][0] >= trip_clan[lll][1]:
    #                return trip_clan[r][1]
    #            else:
    #                return trip_clan[lll][1]
    #else:
    #    if ll == -1:
    #        return trip_clan[r][1]
    #    else:
    #        if x_end - trip_clan[ll][0] >= trip_clan[ll][1]:
    #            return trip_clan[r][1]
    #        else:
    #            return trip_clan[ll][1]
    #llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll
    dis_r = trip_clan[r][1]
    dis_l = trip_clan[l][1]
    dis_ll = -1
    dis_rr = -1
    dis_lll = -1
    dis_rrr = -1
    dis_llll = -1
    dis_rrrr = -1
    if ll != -1:
        if x_end - trip_clan[ll][0] >= trip_clan[ll][1]:
            dis_ll = trip_clan[ll][1]
    if rr != -1:
        if x_end - trip_clan[rr][0] >= trip_clan[rr][1]:
            dis_rr = trip_clan[rr][1]
    if lll != -1:
        if x_end - trip_clan[lll][0] >= trip_clan[lll][1]:
            dis_lll = trip_clan[lll][1]
    if rrr != -1:
        if x_end - trip_clan[rrr][0] >= trip_clan[rrr][1]:
            dis_rrr = trip_clan[rrr][1]
    if llll != -1:
        if x_end - trip_clan[llll][0] >= trip_clan[llll][1]:
            dis_llll = trip_clan[llll][1]
    if rrrr != -1:
        if x_end - trip_clan[rrrr][0] >= trip_clan[rrrr][1]:
            dis_rrrr = trip_clan[rrrr][1]
    return min(dis_l, dis_ll, dis_lll, dis_llll, dis_r, dis_rr, dis_rrr, dis_rrrr)

def solve_t(x_end, dis, trip_clan):
    # x_end: targer x
    # dis: dish info
    # trip_clan: trip clan info
    # part = [x, y, r]
    # return min(num)
    n = 0
    n = get_trip_clan_l(x_end, trip_clan)
    #print 'n:', n
    if x_end < dis[0][0]:
        return dis[0][1]
    elif x_end < dis[-1][0]:
        t = int(x_end - dis[0][0])
        return t * dis[0][1] + (dis[0][1] - dis[1][1]) * (t - 1) / 2 + dis[1][1]
    if len(trip_clan) == 0:
        return dis[-1][1]
    if x_end < trip_clan[0][0]:
        return dis[-1][1]
    if x_end > trip_clan[-1][0]:
        t = int(x_end - trip_clan[-1][0])
        return t * trip_clan[-1][1] + (trip_clan[-1][1] - trip_clan[-2][1]) * (t - 1) / 2 + trip_clan[-2][1]
    dis_l = trip_clan[n][1]
    dis_r = trip_clan[n+1][1]
    if x_end - trip_clan[n][0] >= trip_clan[n][1]:
        return dis_r
    else:
        return dis_l

def solve(x_end, dis, trip_clan):
    # x_end: targer x
    # dis: dish info
    # trip_clan: trip clan info
    # part = [x, y, r]
    # return min(num)
    if x_end < dis[0][0]:
        return dis[0][1]
    elif x_end < dis[-1][0]:
        t = int(x_end - dis[0][0])
        return t * dis[0][1] + (dis[0][1] - dis[1][1]) * (t - 1) / 2 + dis[1][1]
